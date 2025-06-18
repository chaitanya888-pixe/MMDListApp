package com.sample.domain.model

data class NewsInfo(
    val title: String,
    val description: String?,
    val imageUrl: String?,
    val publishedDate: String,
    val sourceName: String
)
