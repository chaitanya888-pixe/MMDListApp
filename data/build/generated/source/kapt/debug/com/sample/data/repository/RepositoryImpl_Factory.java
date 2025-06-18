package com.sample.data.repository;

import com.sample.data.mapper.NewsMapper;
import com.sample.data.network.APIService;
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
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<APIService> apiServiceProvider;

  private final Provider<NewsMapper> mapperProvider;

  public RepositoryImpl_Factory(Provider<APIService> apiServiceProvider,
      Provider<NewsMapper> mapperProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.mapperProvider = mapperProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(apiServiceProvider.get(), mapperProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<APIService> apiServiceProvider,
      Provider<NewsMapper> mapperProvider) {
    return new RepositoryImpl_Factory(apiServiceProvider, mapperProvider);
  }

  public static RepositoryImpl newInstance(APIService apiService, NewsMapper mapper) {
    return new RepositoryImpl(apiService, mapper);
  }
}
