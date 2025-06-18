import com.sample.domain.model.NewsInfo
import com.sample.domain.usecase.GetNewsListUseCase
import com.sample.presentation.viewmodel.NewsViewModel
import io.mockk.coEvery
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import org.junit.Before
import io.mockk.mockk
import junit.framework.TestCase.assertEquals
import junit.framework.TestCase.assertFalse
import junit.framework.TestCase.assertTrue
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.test.resetMain
import org.junit.After
import org.junit.Test
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain

@OptIn(ExperimentalCoroutinesApi::class)
class NewsViewModelTest {
    private val usersUseCase: GetNewsListUseCase = mockk()
    private lateinit var viewModel: NewsViewModel
    private val testDispatcher = StandardTestDispatcher()

    @Before
    fun setUp() {
        Dispatchers.setMain(testDispatcher)
        viewModel = NewsViewModel(usersUseCase)
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain()
    }

    @Test
    fun `fetchData updates newsList and isLoading on success`() = runTest {
        val dummyNews = listOf(
            NewsInfo("Title", "Description", "https://example.com/img.jpg", "2025-06-16", "Source")
        )
        coEvery { usersUseCase.getListUsers() } returns flowOf(Result.success(dummyNews))
        viewModel.fetchData()
        testDispatcher.scheduler.advanceUntilIdle()
        val result = viewModel.newsList.value
        assertEquals(dummyNews, result)
        assertFalse(viewModel.isLoading)
    }

    @Test
    fun `fetchData sets emptyList on failure`() = runTest {
        val exception = RuntimeException("Network error")
        coEvery { usersUseCase.getListUsers() } returns flowOf(Result.failure(exception))
        viewModel.fetchData()
        testDispatcher.scheduler.advanceUntilIdle()
        val result = viewModel.newsList.value
        assertTrue(result.isEmpty())
        assertFalse(viewModel.isLoading)
    }

    @Test
    fun `setSelectedUser updates selectedNews`() = runTest {
        val dummy = NewsInfo("Selected", "desc", "url", "date", "source")
        viewModel.setSelectedUser(dummy)
        assertEquals(dummy, viewModel.selectedNews.value)
    }
}
