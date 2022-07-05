package com.example.tutorial_dagger_rx.di

import com.example.tutorial_dagger_rx.ImageLoader
import com.example.tutorial_dagger_rx.model.User
import com.example.tutorial_dagger_rx.network.GitHubService
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class AppModule {
    @Provides
    fun provideGithubApi() = GitHubService.create()

    @Provides
    fun provideImageLoader() = ImageLoader()

    @Provides
    @Singleton
    @Named("app-module")
    fun provideUser() = User()
}