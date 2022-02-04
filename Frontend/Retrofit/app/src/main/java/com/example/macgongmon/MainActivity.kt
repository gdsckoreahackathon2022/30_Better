package com.example.macgongmon

import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import android.os.Bundle
import com.example.macgongmon.R
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private var mRetrofit: Retrofit? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRetrofitInit()
    }

    private fun setRetrofitInit() {
        mRetrofit = Retrofit.Builder()
            .baseUrl("https://eunproject.herokuapp.com/posts/save")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}