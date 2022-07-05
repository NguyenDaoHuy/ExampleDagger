package com.example.tutorial_dagger_rx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorial_dagger_rx.model.Profile
import com.example.tutorial_dagger_rx.model.User
import com.example.tutorial_dagger_rx.network.GitHubApi
import dagger.android.AndroidInjection
import dagger.android.support.DaggerAppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Named

class MainActivity : DaggerAppCompatActivity() {

    @Inject //anotation
    lateinit var gitHubApi: GitHubApi

    @Inject
    lateinit var imageLoader: ImageLoader

    @Inject
    @Named("app-module")
    lateinit var user1: User   //singleton

    @Inject
    @Named("user-module")
    lateinit var user2: User //activity scope

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    txtTestResult.text = "$user1 \n $user2"

      /*  gitHubApi.getPRofile()
            .enqueue(object : Callback<Profile> {
                override fun onResponse(call: Call<Profile>, response: Response<Profile>) {
                   txtTestResult.text = response.body()?.login
                }

                override fun onFailure(call: Call<Profile>, t: Throwable) {
                    txtTestResult.text = t.message
                }
            })  */
        gitHubApi.rxgetPRofile()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeBy(
                onSuccess ={imageLoader.load(it.avatar_url, txtTestResult)},
                onError = {it.printStackTrace()}
            )
    }
}