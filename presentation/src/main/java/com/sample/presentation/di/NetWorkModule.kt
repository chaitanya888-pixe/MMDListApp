package com.sample.presentation.di

import com.sample.data.network.APIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetWorkModule {
    @Provides
    @Singleton
    fun getApiServe(retrofit: Retrofit): APIService {
        return retrofit.create(APIService::class.java)
    }
}