package app.shamlatech.startup.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import app.shamlatech.startup.R
import app.shamlatech.startup.repository.PostsRepo
import app.shamlatech.startup.viewmodel.PostListViewModel
import development.app.checking.app.App


class MainActivity : BaseActivity() {

    private lateinit var viewModel: PostListViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this).get(PostListViewModel::class.java)
        viewModel.inject(application as App)
        initCode()
    }

    /*actual code starts here*/
    private fun initCode() {
        /*pref*/
        if ((viewModel.mPrefsMangers.getData("a", "") as String).length<=0) {
            viewModel.mPrefsMangers.putData("a", "Android dagger!")
        }else {
            showToast(viewModel.mPrefsMangers.getData("a", "") as String)
        }

        /*room*/
        viewModel.insertTodo((application as App).appDatabase!!)


        viewModel.posts.observe(this, Observer {posts->
            val k = posts.filter {
                it.title.contains("provident")
            }
            for (element in k){
                makeLog(element.title)
            }
        })

        viewModel.users.observe(this, Observer {users->

            for (element in users){
                makeLog(element.email)
            }
        })

        viewModel.isLoading.observe(this, Observer {
            if (it){
                showToast("loading..")
            }else{
                showToast("done..")
            }


        })

        /* dagger2/retrofit2/rxJava2 */
        viewModel.loadRepository()
        viewModel.getAllPosts()
        viewModel.getAllUsers()
        /*parallel request*/
        viewModel.getComplexDetails()

    }


}
