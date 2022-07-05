package com.example.tutorial_dagger_rx.network


import com.example.tutorial_dagger_rx.model.Profile
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET

interface GitHubApi {
    @GET("users/thanhniencung")
    fun getPRofile(): Call<Profile>

    @GET("users/thanhniencung")
    fun rxgetPRofile(): Single<Profile>
}