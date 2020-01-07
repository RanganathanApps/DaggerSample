package app.shamlatech.startup.viewmodel

import androidx.lifecycle.ViewModel
import development.app.checking.app.App

abstract class BaseViewModel: ViewModel(){

    /*private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .prefsModule(SharedPreferencesModule(getApplication()))
        .build()*/


    /**
     * Injects the required dependencies
     */
    fun inject(app:App) {
        when (this) {
            is PostListViewModel -> app.injector!!.inject(this)

        }
    }
}