package com.sample.presentation.viewmodel;

import com.sample.domain.usecase.GetNewsListUseCase;
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
public final class NewsViewModel_Factory implements Factory<NewsViewModel> {
  private final Provider<GetNewsListUseCase> usersUseCaseProvider;

  public NewsViewModel_Factory(Provider<GetNewsListUseCase> usersUseCaseProvider) {
    this.usersUseCaseProvider = usersUseCaseProvider;
  }

  @Override
  public NewsViewModel get() {
    return newInstance(usersUseCaseProvider.get());
  }

  public static NewsViewModel_Factory create(Provider<GetNewsListUseCase> usersUseCaseProvider) {
    return new NewsViewModel_Factory(usersUseCaseProvider);
  }

  public static NewsViewModel newInstance(GetNewsListUseCase usersUseCase) {
    return new NewsViewModel(usersUseCase);
  }
}
