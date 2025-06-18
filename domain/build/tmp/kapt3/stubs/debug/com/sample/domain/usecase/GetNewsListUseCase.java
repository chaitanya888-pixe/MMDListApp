package com.sample.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\n0\tH\u0086@\u00a2\u0006\u0002\u0010\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000e"}, d2 = {"Lcom/sample/domain/usecase/GetNewsListUseCase;", "", "news", "Lcom/sample/domain/repository/NewsRepository;", "(Lcom/sample/domain/repository/NewsRepository;)V", "getNews", "()Lcom/sample/domain/repository/NewsRepository;", "setNews", "getListUsers", "Lkotlinx/coroutines/flow/Flow;", "Lkotlin/Result;", "", "Lcom/sample/domain/model/NewsInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "domain_debug"})
public final class GetNewsListUseCase {
    @org.jetbrains.annotations.NotNull()
    private com.sample.domain.repository.NewsRepository news;
    
    @javax.inject.Inject()
    public GetNewsListUseCase(@org.jetbrains.annotations.NotNull()
    com.sample.domain.repository.NewsRepository news) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.sample.domain.repository.NewsRepository getNews() {
        return null;
    }
    
    public final void setNews(@org.jetbrains.annotations.NotNull()
    com.sample.domain.repository.NewsRepository p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getListUsers(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends kotlin.Result<? extends java.util.List<com.sample.domain.model.NewsInfo>>>> $completion) {
        return null;
    }
}