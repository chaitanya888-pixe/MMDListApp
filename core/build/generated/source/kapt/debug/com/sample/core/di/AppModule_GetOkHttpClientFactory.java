package com.sample.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
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
public final class AppModule_GetOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  private final Provider<Interceptor> interceptorProvider;

  public AppModule_GetOkHttpClientFactory(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider,
      Provider<Interceptor> interceptorProvider) {
    this.loggingInterceptorProvider = loggingInterceptorProvider;
    this.interceptorProvider = interceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return getOkHttpClient(loggingInterceptorProvider.get(), interceptorProvider.get());
  }

  public static AppModule_GetOkHttpClientFactory create(
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider,
      Provider<Interceptor> interceptorProvider) {
    return new AppModule_GetOkHttpClientFactory(loggingInterceptorProvider, interceptorProvider);
  }

  public static OkHttpClient getOkHttpClient(HttpLoggingInterceptor loggingInterceptor,
      Interceptor interceptor) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.getOkHttpClient(loggingInterceptor, interceptor));
  }
}
