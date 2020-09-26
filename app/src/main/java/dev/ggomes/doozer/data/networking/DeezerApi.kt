package dev.ggomes.doozer.data.networking

import dev.ggomes.doozer.data.models.Artist
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface DeezerApi {

    @GET("artist/{id}")
    fun getArtistBy(@Path("id") id: String): Single<Artist>

    @GET("search")
    fun searchArtist(@Query("q") term: String): Single<List<Artist>>

    @GET("artist/{id}/albums")
    fun getAlbumsByArtists(@Path("id") id: String)

    @GET("album/{id}/tracks")
    fun getTracksByAlbums(@Path("id") id: String)
}