package com.example.tutorial_dagger_rx.di

import com.example.tutorial_dagger_rx.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {

     @ActivityScope
     @ContributesAndroidInjector(modules = [UserModule::class])
     abstract fun bindMainActivity() : MainActivity
}