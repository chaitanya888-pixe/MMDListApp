package com.sample.data.di;

import com.sample.data.network.APIService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

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
public final class NetWorkModule_GetApiServeFactory implements Factory<APIService> {
  private final Provider<Retrofit> retrofitProvider;

  public NetWorkModule_GetApiServeFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public APIService get() {
    return getApiServe(retrofitProvider.get());
  }

  public static NetWorkModule_GetApiServeFactory create(Provider<Retrofit> retrofitProvider) {
    return new NetWorkModule_GetApiServeFactory(retrofitProvider);
  }

  public static APIService getApiServe(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetWorkModule.INSTANCE.getApiServe(retrofit));
  }
}
