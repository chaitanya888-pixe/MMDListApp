package com.sample.domain.usecase

import com.sample.domain.model.NewsInfo
import com.sample.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


class GetNewsListUseCase @Inject constructor(var news: NewsRepository) {
    suspend fun getListUsers(): Flow<Result<List<NewsInfo>>> {
        return news.getNewsList()
    }
}