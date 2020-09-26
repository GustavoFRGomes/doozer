package dev.ggomes.doozer.data.models

import com.google.gson.annotations.SerializedName

data class AlbumTracks(
    val id: String,
    val title: String,
    @SerializedName("track_position") val trackPosition: Int,
    @SerializedName("disk_number") val diskNumber: Int
)