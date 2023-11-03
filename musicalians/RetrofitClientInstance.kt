package com.asiae.minorfinal

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//레트로핏 인스턴스 생성
class RetrofitClientInstance {
    // 클래스의 인스턴스를 생성하지 않고도 바로 접근할 수 있도록 함
    companion object{
        // REST API의 기본 URL
        private val BASE_URL: String = "https://jsonplaceholder.typicode.com"
    }

    // Retrofit 객체 반환.
    // Retrofit 객체는 Retrofit 라이브러리를 사용해 REST API와 통신하기 위해 사용됨
    fun getRetrofitInstance(): Retrofit{
        var retrofit = retrofit2
            // Retrofit 빌더 초기화
            .Retrofit.Builder()
            // 기본 URL 설정
            .baseUrl(BASE_URL)
            //Retrofit이 Gson을 사용하여 JSON 응답을 변환할 수 있도록 지정
            .addConverterFactory(GsonConverterFactory.create())
            // Retrofit 클라이언트 인스턴스를 생성해 반환. 이 인스턴스는 REST API와 통신하기 위해 사용
            .build()!!
        return retrofit

    }
}