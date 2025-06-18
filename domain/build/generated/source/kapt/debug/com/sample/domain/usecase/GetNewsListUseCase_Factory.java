package com.sample.domain.usecase;

import com.sample.domain.repository.NewsRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class GetNewsListUseCase_Factory implements Factory<GetNewsListUseCase> {
  private final Provider<NewsRepository> newsProvider;

  public GetNewsListUseCase_Factory(Provider<NewsRepository> newsProvider) {
    this.newsProvider = newsProvider;
  }

  @Override
  public GetNewsListUseCase get() {
    return newInstance(newsProvider.get());
  }

  public static GetNewsListUseCase_Factory create(Provider<NewsRepository> newsProvider) {
    return new GetNewsListUseCase_Factory(newsProvider);
  }

  public static GetNewsListUseCase newInstance(NewsRepository news) {
    return new GetNewsListUseCase(news);
  }
}
