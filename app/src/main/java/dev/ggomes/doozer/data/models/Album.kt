package dev.ggomes.doozer.data.models

import com.google.gson.annotations.SerializedName

data class Album(
    val id: String,
    val title: String,
    @SerializedName("cover") val coverUrl: String
)