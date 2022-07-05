package com.example.tutorial_dagger_rx.network

import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class GitHubService {

    companion object Factory{
        fun create() : GitHubApi{
            var retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
            return  retrofit.create<GitHubApi>(GitHubApi::class.java)
        }
    }


}