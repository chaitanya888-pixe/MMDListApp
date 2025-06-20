package com.sample.assesmentapp.config

import com.sample.assesmentapp.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named

@Module
@InstallIn(SingletonComponent::class)
object Config {

    @Provides
    @Named("base_url")
    fun provideBaseUrl(): String = BuildConfig.BASE_URL

    @Provides
    @Named("api_key")
    fun provideApiKey(): String = BuildConfig.API_KEY
}
