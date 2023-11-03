package com.asiae.minorfinal

import retrofit2.Call
import retrofit2.http.GET

//엔드포인트 설정
interface GetDataService {
    @GET("/photos")
    fun getAllPhoto(): Call<List<RetroPhoto>>
}