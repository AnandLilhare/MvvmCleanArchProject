package com.anushka.newsapiclient.presentation.di

import com.anushka.newsapiclient.presentation.adapter.NewsAdapter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AdapterModule {

    @Singleton
    @Provides
    fun provideNewAdapter():NewsAdapter {
        return NewsAdapter()
    }
}