package com.asiae.minorfinal

import com.google.gson.annotations.SerializedName

//데이터 통신을 위한 모델클래스 생성
data class RetroPhoto(
    @SerializedName("albumId")      var albumId: Int,
    @SerializedName("id")           var id: Long,
    @SerializedName("title")        var title: String,
    @SerializedName("url")          var url: String,
    @SerializedName("thumbnailUrl") var thumbnailUrl: String,
){

}