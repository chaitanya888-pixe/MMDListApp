package com.sample.domain.repository

import com.sample.domain.model.NewsInfo
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsList():Flow<Result<List<NewsInfo>>>
}