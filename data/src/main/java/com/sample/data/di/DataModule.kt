package com.sample.data.di

import com.sample.data.repository.RepositoryImpl
import com.sample.data.repository.datasource.RemoteDataSource
import com.sample.data.repository.datasourceimpl.RemoteDataSourceImpl
import com.sample.domain.repository.NewsRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindRemoteDataSource(
        impl: RemoteDataSourceImpl
    ): RemoteDataSource

    @Binds
    @Singleton
    abstract fun bindNewsRepository(
        impl: RepositoryImpl
    ): NewsRepository
}
