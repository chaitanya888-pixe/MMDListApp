package com.sample.core.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.Interceptor;

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
public final class AppModule_GetInterceptorFactory implements Factory<Interceptor> {
  @Override
  public Interceptor get() {
    return getInterceptor();
  }

  public static AppModule_GetInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Interceptor getInterceptor() {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.getInterceptor());
  }

  private static final class InstanceHolder {
    private static final AppModule_GetInterceptorFactory INSTANCE = new AppModule_GetInterceptorFactory();
  }
}
