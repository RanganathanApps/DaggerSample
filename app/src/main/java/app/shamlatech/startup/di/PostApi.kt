package app.shamlatech.startup.di

import app.shamlatech.startup.model.Post
import app.shamlatech.startup.model.User
import io.reactivex.Maybe
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.http.GET

interface PostApi {
    /**
     * Get the list of the pots from the API
     */
    @GET("/posts")
    fun getPosts(): Maybe<List<Post>>

    @GET("/users")
    fun getUsers(): Maybe<List<User>>
}