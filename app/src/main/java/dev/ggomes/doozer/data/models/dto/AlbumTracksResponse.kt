package dev.ggomes.doozer.data.models.dto

import dev.ggomes.doozer.data.models.AlbumTracks

data class AlbumTracksResponse(
    val data: List<AlbumTracks>,
    val total: Int
)