package app.shamlatech.startup.repository

import app.shamlatech.startup.di.PostApi
import app.shamlatech.startup.model.Post
import app.shamlatech.startup.model.User
import io.reactivex.Maybe
import javax.inject.Inject

open class PostsRepo(val postApi: PostApi) : BaseRepository() {


    fun loadPosts() : Maybe<List<Post>>{
        return postApi.getPosts()
    }

    fun loadUsers() : Maybe<List<User>>{
        return postApi.getUsers()
    }
}