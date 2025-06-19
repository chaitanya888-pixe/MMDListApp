package com.sample.data.repository

import com.sample.data.mapper.NewsMapper
import com.sample.data.model.Article
import com.sample.data.model.NewsResponse
import com.sample.data.model.Source
import com.sample.data.network.APIService
import com.sample.data.repository.datasource.RemoteDataSource
import com.sample.domain.model.NewsInfo
import io.mockk.coEvery
import io.mockk.every
import io.mockk.mockk
import junit.framework.Assert.assertTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test


@OptIn(ExperimentalCoroutinesApi::class)
class RepositoryImplTest {

    private lateinit var repository: RepositoryImpl
    private val remoteDataSource: RemoteDataSource = mockk()
    private val mapper: NewsMapper = mockk()

    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        repository = RepositoryImpl(remoteDataSource, mapper)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `getNewsList emits success result when API call and mapping succeed`() = runTest {
        val newsResponse = NewsResponse(
            status = "ok",
            totalResults = 1,
            articles = listOf(Article(Source("1", "Test Source"), "Author", "Title", "Description", "url", "image", "date"))
        )
        val expectedMappedList = listOf(
            NewsInfo("Title", "Description", "https://example.com/image.jpg","Date","Google")
        )
        coEvery { remoteDataSource.getNewsHeadlines() } returns newsResponse
        every { mapper.mapFromApiResponse(newsResponse) } returns expectedMappedList
        val result = repository.getNewsList().first()
        assertTrue(result.isSuccess)
        assertEquals(expectedMappedList, result.getOrNull())
    }

    @Test
    fun `getNewsList emits failure result when exception is thrown`() = runTest {
        val errorMessage = "Network failure"
        coEvery { remoteDataSource.getNewsHeadlines() } throws RuntimeException(errorMessage)
        val result = repository.getNewsList().first()
        assertTrue(result.isFailure)
        assertEquals(errorMessage, result.exceptionOrNull()?.message)
    }
}

