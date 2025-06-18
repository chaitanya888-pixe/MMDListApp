package com.sample.data.repository

import com.sample.data.mapper.NewsMapper
import com.sample.data.model.NewsResponse
import com.sample.data.network.APIService
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


@ExperimentalCoroutinesApi
class RepositoryImplTest {
    private val apiService: APIService = mockk()
    private val mapper: NewsMapper = mockk()
    private lateinit var repository: RepositoryImpl
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        repository = RepositoryImpl(apiService, mapper)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `getNewsList emits success when API and mapping succeed`() = runTest {
        val apiResponse = NewsResponse("ok", 1, listOf())
        val mappedList = listOf(
            NewsInfo("Title", "Description", "URL", "Date", "Testing")
        )
        coEvery { apiService.getNewsHeadlines(any(), any()) } returns apiResponse
        every { mapper.mapFromApiResponse(apiResponse) } returns mappedList
        val result = repository.getNewsList().first()
        assertTrue(result.isSuccess)
        assertEquals(mappedList, result.getOrNull())
    }

    @Test
    fun `getNewsList emits failure when API throws exception`() = runTest {
        coEvery { apiService.getNewsHeadlines(any(), any()) } throws RuntimeException("Network error")
        val result = repository.getNewsList().first()
        assertTrue(result.isFailure)
        assertEquals("Network error", result.exceptionOrNull()?.message)
    }
}
