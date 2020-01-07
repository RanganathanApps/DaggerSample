package app.shamlatech.startup.di

import app.shamlatech.startup.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface SimpleApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}