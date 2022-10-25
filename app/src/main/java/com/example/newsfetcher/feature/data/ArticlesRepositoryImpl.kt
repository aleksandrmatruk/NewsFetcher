package com.example.newsfetcher.feature.data

import com.example.newsfetcher.feature.domain.ArticleModel

class ArticlesRepositoryImpl(private val sourse: ArticlesRemoteSourse): ArticlesRepository {
    override suspend fun getArticles(): List<ArticleModel> {
        return sourse.getArticles().articleList.map{
            it.toDomain()
        }
    }

}