package com.sample.assesmentapp.di

import com.sample.data.di.DataModule
import com.sample.data.di.NetWorkModule
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(
    includes = [
        NetWorkModule::class, DataModule::class
    ]
)
@InstallIn(SingletonComponent::class)
object AppEntryModule