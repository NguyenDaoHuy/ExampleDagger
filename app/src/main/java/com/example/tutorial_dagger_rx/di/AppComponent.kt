package com.example.tutorial_dagger_rx.di

import com.example.tutorial_dagger_rx.C4FApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton


//scope
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    ActivityBindingModule::class
])
interface AppComponent : AndroidInjector<C4FApp> {

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(app: C4FApp) : Builder

        fun build() : AppComponent
    }
}