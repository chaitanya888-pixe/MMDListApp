package com.sample.data.repository

import com.sample.core.utils.Constants.DEFAULT_COUNTRY
import com.sample.data.mapper.NewsMapper
import com.sample.data.network.APIService
import com.sample.domain.model.NewsInfo
import com.sample.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class RepositoryImpl @Inject constructor (
    private var apiService: APIService,
    private val mapper: NewsMapper
) : NewsRepository {
    override suspend fun getNewsList(): Flow<Result<List<NewsInfo>>> = flow {
        val response = apiService.getNewsHeadlines(DEFAULT_COUNTRY)
        val mappedNewsList = mapper.mapFromApiResponse(response)
        emit(Result.success(mappedNewsList))
    }.catch { e ->
        emit(Result.failure(Exception(e.message)))
    }
}