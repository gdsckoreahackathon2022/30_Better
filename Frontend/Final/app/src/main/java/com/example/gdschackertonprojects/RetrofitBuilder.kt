package com.example.gdschackertonprojects

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    var api: API

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://eunproject.herokuapp.com/posts/save")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(API::class.java)
    }
}