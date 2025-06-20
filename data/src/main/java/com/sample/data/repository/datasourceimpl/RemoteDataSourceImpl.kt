package com.sample.data.repository.datasourceimpl

import com.sample.core.utils.Constants.DEFAULT_COUNTRY
import com.sample.data.model.NewsResponse
import com.sample.data.network.APIService
import com.sample.data.repository.datasource.RemoteDataSource
import javax.inject.Inject
import javax.inject.Named

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: APIService,@Named("api_key") private val api_key: String
) : RemoteDataSource {

    override suspend fun getNewsHeadlines(): NewsResponse {
        return apiService.getNewsHeadlines(DEFAULT_COUNTRY, api_key)
    }
}