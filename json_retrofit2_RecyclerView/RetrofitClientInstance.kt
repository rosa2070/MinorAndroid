package com.asiae.retrofitjsonrecyclerview

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClientInstance {
    companion object{
        private val BASE_URL: String = "https://jsonplaceholder.typicode.com"
    }

    fun getRetrofitInstance(): Retrofit{
        val retrofit = retrofit2
            .Retrofit
            .Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()!!
        return retrofit
    }
}