package com.example.tutorial_dagger_rx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutorial_dagger_rx.model.User
import javax.inject.Inject

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}