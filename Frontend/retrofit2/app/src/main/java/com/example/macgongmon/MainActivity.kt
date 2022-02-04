package com.example.macgongmon

import androidx.appcompat.app.AppCompatActivity
import retrofit2.Retrofit
import android.os.Bundle
import android.util.Log
import com.example.macgongmon.R
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


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

        fun onResponse(
            call: Call<ResponseModel>,
            response: Response<ContentModel>
        ) {
            if(response.isSuccessful) {
                Log.d("test", response.body().toString())
                    var data = response.body()
            }
        }

        fun onFailure(call:
        Call<ResponseModel>, t: Throwable) {
            Log.d("test", "실패$t")
        }

}