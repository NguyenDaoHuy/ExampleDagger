package com.example.tutorial_dagger_rx.di

import com.example.tutorial_dagger_rx.model.User
import dagger.Module
import dagger.Provides
import javax.inject.Named


@Module
class UserModule {

    @Provides
    @Named("user-module")
    fun provideUser() = User()
}