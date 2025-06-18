package com.sample.data.network

import com.sample.core.utils.Constants.DEFAULT_COUNTRY
import com.sample.data.BuildConfig
import com.sample.data.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("top-headlines")
    suspend fun getNewsHeadlines(@Query("country") country: String=DEFAULT_COUNTRY,
                         @Query("apikey")apiKey: String= BuildConfig.API_KEY): NewsResponse

}
