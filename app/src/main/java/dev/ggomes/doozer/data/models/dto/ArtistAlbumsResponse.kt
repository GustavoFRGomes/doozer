package dev.ggomes.doozer.data.models.dto

import com.google.gson.annotations.SerializedName
import dev.ggomes.doozer.data.models.Album

data class ArtistAlbumsResponse (
    val data: List<Album>,
    val total: Int,
    @SerializedName("next") val nextPage: String
)