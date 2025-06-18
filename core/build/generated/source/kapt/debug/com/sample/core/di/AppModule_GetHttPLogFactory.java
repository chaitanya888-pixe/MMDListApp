package com.sample.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
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
public final class AppModule_GetHttPLogFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return getHttPLog();
  }

  public static AppModule_GetHttPLogFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor getHttPLog() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.getHttPLog());
  }

  private static final class InstanceHolder {
    private static final AppModule_GetHttPLogFactory INSTANCE = new AppModule_GetHttPLogFactory();
  }
}
