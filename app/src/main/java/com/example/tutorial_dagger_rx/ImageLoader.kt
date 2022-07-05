package com.example.tutorial_dagger_rx

import android.widget.ImageView
import com.squareup.picasso.Picasso

class ImageLoader {
     // zip,,merge,flatmap
     fun load(url : String, iv: ImageView)
          = Picasso.get().load(url).into(iv)
}