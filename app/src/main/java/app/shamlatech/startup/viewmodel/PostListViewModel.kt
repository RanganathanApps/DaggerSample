package app.shamlatech.startup.viewmodel

import android.annotation.SuppressLint
import androidx.lifecycle.MutableLiveData
import app.shamlatech.startup.Pref.PrefsMangers
import app.shamlatech.startup.di.PostApi
import app.shamlatech.startup.model.Post
import app.shamlatech.startup.model.User
import app.shamlatech.startup.repository.PostsRepo
import app.shamlatech.startup.room.AppDatabase
import app.shamlatech.startup.room.TodoEntity
import apps.ranganathan.configlibrary.base.BaseAppActivity.Companion.makeLog
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class PostListViewModel : BaseViewModel(){


    @Inject
    lateinit var postApi: PostApi

    @Inject
    lateinit var mPrefsMangers: PrefsMangers

    private lateinit var postsRepo: PostsRepo

    private var myCompositeDisposable: CompositeDisposable? = null

    var posts: MutableLiveData<List<Post>> = MutableLiveData()
    var users: MutableLiveData<List<User>> = MutableLiveData()
    var isLoading: MutableLiveData<Boolean> = MutableLiveData()
    var complexString: MutableLiveData<String> = MutableLiveData()

    init {

    }

    /*room - insert*/
    internal fun insertTodo(appDatabase:AppDatabase) : Boolean{
        var todoEntity = TodoEntity(0,"UI","Content stored in table!")
        appDatabase.todoDAO().insertTodo(todoEntity)
        for (i in appDatabase.todoDAO().getAll().indices){
            makeLog(""+appDatabase.todoDAO().getAll().get(i).id
                    +" : "+appDatabase.todoDAO().getAll().get(i).title
                    +" : "+ appDatabase.todoDAO().getAll().get(i).content)
        }
        return true
    }

    internal fun loadRepository(){
        postsRepo = PostsRepo(postApi)
    }
    /*networking with rxJava2*/
    internal fun getAllPosts(){


        myCompositeDisposable = CompositeDisposable()
        myCompositeDisposable!!.add(
            postsRepo.loadPosts()
            .flatMap { posts ->
                postsRepo.loadPosts()
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnSubscribe {
                //showToast("loading")
                //isLoading.value=true
            }
            .subscribe(this::handleResponse) {
                //handle error as you want
                //showToast("handle error as you want ${it.localizedMessage}")
            })
    }

    /*response handled for Post api*/
    private fun handleResponse(posts: List<Post>) {
        /*livedata to update the UI*/
        //isLoading.value=false
        this.posts.value = posts

    }

    /*response handled for users api*/
    private fun handleResponseUsers(users: List<User>) {
        /*livedata to update the UI*/
        this.users.value = users
    }

    private fun handleResponse2(posts: String) {
        //showToast(posts)
        this.complexString.value = posts
    }

    @SuppressLint("CheckResult")
    fun getComplexDetails() {
       /* val subscribe: Any = Maybe.zip(
            postsRepo.loadPosts(), postsRepo.loadUsers(), postsRepo.loadUsers(),
            Function3<List<Post>, List<User>, List<User>, String> { list1, list2, list3 ->
                var a = list1[0].title
                a += " ${list2[1].email}"
                a
            })
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(this::handleResponse2) {
                //handle error as you want
                //showToast("handle error as you want ${it.localizedMessage}")
            }
*/
    }

    /*networking with rxJava2*/
    internal fun getAllUsers(){
       /* myCompositeDisposable = CompositeDisposable()
        myCompositeDisposable!!.add(
            postsRepo.loadUsers()
            .map { usersList -> usersList.filter{it.email.contains("an") }  }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .doOnSubscribe {
                //showToast("loading")
            }
            *//* .doOnNext {  showToast("done") }
             .doOnComplete {  showToast("Complete") }*//*
            .subscribe(this::handleResponseUsers) {
                //handle error as you want
                //showToast("handle error as you want ${it.localizedMessage}")
            })*/
    }

}