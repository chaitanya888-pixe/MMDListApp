
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\u00060\nj\u0002`\u000bH\u0007J\f\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0007J\f\u0010\r\u001a\u00060\nj\u0002`\u000bH\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007J\b\u0010\u000f\u001a\u00020\nH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"LNewsViewModelTest;", "", "()V", "testDispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "usersUseCase", "Lcom/sample/domain/usecase/GetNewsListUseCase;", "viewModel", "Lcom/sample/presentation/viewmodel/NewsViewModel;", "fetchData sets emptyList on failure", "", "Lkotlinx/coroutines/test/TestResult;", "fetchData updates newsList and isLoading on success", "setSelectedUser updates selectedNews", "setUp", "tearDown", "presentation_debugUnitTest"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.ExperimentalCoroutinesApi.class})
public final class NewsViewModelTest {
    @org.jetbrains.annotations.NotNull()
    private final com.sample.domain.usecase.GetNewsListUseCase usersUseCase = null;
    private com.sample.presentation.viewmodel.NewsViewModel viewModel;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.test.TestDispatcher testDispatcher = null;
    
    public NewsViewModelTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    @org.junit.After()
    public final void tearDown() {
    }
}