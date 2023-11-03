package com.asiae.retrofitjsonrecyclerview

import retrofit2.Call
import retrofit2.http.GET

interface GetDataService {
    @GET("/photos")
    fun getAllPhoto(): Call<List<RetroPhoto>>
}