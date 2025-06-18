package com.sample.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0096@\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/sample/data/repository/RepositoryImpl;", "Lcom/sample/domain/repository/NewsRepository;", "apiService", "Lcom/sample/data/network/APIService;", "mapper", "Lcom/sample/data/mapper/NewsMapper;", "(Lcom/sample/data/network/APIService;Lcom/sample/data/mapper/NewsMapper;)V", "getNewsList", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Lcom/sample/domain/model/NewsInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class RepositoryImpl implements com.sample.domain.repository.NewsRepository {
    @org.jetbrains.annotations.NotNull()
    private com.sample.data.network.APIService apiService;
    @org.jetbrains.annotations.NotNull()
    private final com.sample.data.mapper.NewsMapper mapper = null;
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.sample.data.network.APIService apiService, @org.jetbrains.annotations.NotNull()
    com.sample.data.mapper.NewsMapper mapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getNewsList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<com.sample.domain.model.NewsInfo>>>> $completion) {
        return null;
    }
}