package com.asiae.retrofitjsonrecyclerview

import com.google.gson.annotations.SerializedName

data class RetroPhoto(
    @SerializedName("albumId") var albumId: Int,
    @SerializedName("id") var id: Long,
    @SerializedName("title") var title: String,
    @SerializedName("url") var url: String,
    @SerializedName("thumbnailUrl") var thumbnailUrl: String
)
