package com.example.macgongmon

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FieldMap
import retrofit2.http.FormUrlEncoded
import retrofit2.http.*
import java.net.CacheRequest

interface API {
    @POST("/api/v1/posts/")
    fun post_user(
        @Body jsonparams: ResponseModel
    ): Call<ResponseModel>

    @GET("/")
    fun get_user(
    ): Call<ContentModel>

    companion object {
        private const val BASE_URL = "https://eunproject.herokuapp.com/posts/save"

        fun create(): API {
            val gson: Gson = GsonBuilder().setLenient().create()
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(API::class.java)
        }
    }
}