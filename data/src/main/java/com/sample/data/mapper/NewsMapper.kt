package com.sample.data.mapper

import com.sample.data.model.Article
import com.sample.data.model.NewsResponse
import com.sample.domain.model.NewsInfo
import javax.inject.Inject

class NewsMapper @Inject constructor() {
    fun mapFromApiResponse(response: NewsResponse): List<NewsInfo> {
        return response.articles.map { mapArticleToNews(it) }
    }

    private fun mapArticleToNews(article: Article): NewsInfo {
        return NewsInfo(
            title = article.title ?: "No Title",
            description = article.description,
            imageUrl = article.urlToImage,
            publishedDate = article.publishedAt,
            sourceName = article.source.name
        )
    }
}