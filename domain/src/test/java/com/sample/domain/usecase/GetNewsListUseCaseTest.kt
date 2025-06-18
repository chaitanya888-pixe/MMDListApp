package com.sample.domain.usecase

import app.cash.turbine.test
import com.sample.domain.model.NewsInfo
import com.sample.domain.repository.NewsRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.runTest
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class GetNewsListUseCaseTest {
    private lateinit var useCase: GetNewsListUseCase
    private val newsRepository: NewsRepository = mockk()

    @Before
    fun setUp() {
        useCase = GetNewsListUseCase(newsRepository)
    }

    @Test
    fun `getListNews returns success result with list of news`() = runTest {
        val mockList = listOf(
            NewsInfo(
                title = "Title",
                description = "Description",
                imageUrl = "https://example.com/image.jpg",
                publishedDate = "2025-06-16",
                sourceName = "Source"
            ))

            val expectedResult = Result.success(mockList)

        coEvery { newsRepository.getNewsList() } returns flowOf(expectedResult)

         useCase.getListUsers().test {
             val result = awaitItem()
             assert(result.isSuccess)
             assertEquals(mockList, result.getOrNull())
             awaitComplete()
         }
    }
    @Test
    fun `getListNews returns failure result`() = runTest {
        val exception = RuntimeException("Network error")
        val expectedResult = Result.failure<List<NewsInfo>>(exception)
        coEvery { newsRepository.getNewsList() } returns flowOf(expectedResult)
        useCase.getListUsers().test {
            val result = awaitItem()
            assert(result.isFailure)
            assertEquals(exception.message, result.exceptionOrNull()?.message)
            awaitComplete()
        }
    }

}