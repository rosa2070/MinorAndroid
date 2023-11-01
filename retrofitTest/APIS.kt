package com.asiae.retrofit2test

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIS {

    @POST("/users")
    @Headers("accept: application/json", // 클라이언트가 서버로부터 JSON 형식의 응답을 기대
        "content-type: application/json") // 요청의 본문(content)이 JSON 형식
    fun post_users(
        @Body jsonparams: PostModel
    ): Call<PostResult>

    @GET("/users")
    @Headers("accept: application/json",
        "content-type: application/json"
    )
    fun get_users(
    ): Call<HTTP_GET_Model>

    companion object {
        private const val BASE_URL = "http://234.234.234.33:7712/" // 주소

        fun create() : APIS {

            val gson: Gson = GsonBuilder().setLenient().create();

            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()
                .create(APIS::class.java)
        }
    }


}