package com.example.tutorial_dagger_rx

import android.app.Application
import com.example.tutorial_dagger_rx.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class C4FApp : DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
               = DaggerAppComponent.builder()
                   .application(this)
                   .build()
}