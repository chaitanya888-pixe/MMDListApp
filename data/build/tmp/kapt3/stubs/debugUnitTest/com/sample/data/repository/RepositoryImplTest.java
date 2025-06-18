package com.sample.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u000b\u001a\u00060\fj\u0002`\rH\u0007J\f\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0007J\b\u0010\u0010\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/sample/data/repository/RepositoryImplTest;", "", "()V", "apiService", "Lcom/sample/data/network/APIService;", "mapper", "Lcom/sample/data/mapper/NewsMapper;", "repository", "Lcom/sample/data/repository/RepositoryImpl;", "testDispatcher", "Lkotlinx/coroutines/test/TestDispatcher;", "getNewsList emits failure when API throws exception", "", "Lkotlinx/coroutines/test/TestResult;", "getNewsList emits success when API and mapping succeed", "setUp", "tearDown", "data_debugUnitTest"})
@kotlinx.coroutines.ExperimentalCoroutinesApi()
public final class RepositoryImplTest {
    @org.jetbrains.annotations.NotNull()
    private final com.sample.data.network.APIService apiService = null;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.data.mapper.NewsMapper mapper = null;
    private com.sample.data.repository.RepositoryImpl repository;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.test.TestDispatcher testDispatcher = null;
    
    public RepositoryImplTest() {
        super();
    }
    
    @org.junit.Before()
    public final void setUp() {
    }
    
    @org.junit.After()
    public final void tearDown() {
    }
}