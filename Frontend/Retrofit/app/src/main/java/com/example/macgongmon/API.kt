package com.example.macgongmon

import com.example.macgongmon.ResponseModel
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

class API {

    interface ResisterApi {
        @GET("/api/v1/posts/")
        fun getRepoList(@Query("q") query: String): Observable<ResponseModel>
    }

    companion object {
        fun getRepoList(query: String): Observable<ResponseModel> {
            return RetrofitCreator.create(ResisterApi::class.java).getRepoList(query)
        }
    }
}