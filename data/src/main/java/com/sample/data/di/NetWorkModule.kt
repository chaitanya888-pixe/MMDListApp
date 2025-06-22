package com.sample.data.di

import com.sample.data.network.APIService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
object NetWorkModule {
    @Provides
    @Singleton
    fun getApiServe(retrofit: Retrofit): APIService {
        return retrofit.create(APIService::class.java)
    }
}