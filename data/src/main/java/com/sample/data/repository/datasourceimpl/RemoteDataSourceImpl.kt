package com.sample.data.repository.datasourceimpl

import com.sample.core.Constants
import com.sample.core.utils.Constants.DEFAULT_COUNTRY
import com.sample.data.model.NewsResponse
import com.sample.data.network.APIService
import com.sample.data.repository.datasource.RemoteDataSource
import javax.inject.Inject
import javax.inject.Named

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : RemoteDataSource {

    override suspend fun getNewsHeadlines(): NewsResponse {
        return apiService.getNewsHeadlines(DEFAULT_COUNTRY, Constants.API_KEY)
    }
}