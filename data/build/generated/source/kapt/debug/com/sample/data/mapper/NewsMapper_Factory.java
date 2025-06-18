package com.sample.data.mapper;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class NewsMapper_Factory implements Factory<NewsMapper> {
  @Override
  public NewsMapper get() {
    return newInstance();
  }

  public static NewsMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static NewsMapper newInstance() {
    return new NewsMapper();
  }

  private static final class InstanceHolder {
    private static final NewsMapper_Factory INSTANCE = new NewsMapper_Factory();
  }
}
