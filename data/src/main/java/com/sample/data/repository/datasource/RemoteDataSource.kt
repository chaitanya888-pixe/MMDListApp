package com.sample.data.repository.datasource

import com.sample.data.model.NewsResponse

interface RemoteDataSource {
    suspend fun getNewsHeadlines(): NewsResponse
}
