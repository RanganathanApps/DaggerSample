package development.app.checking.app

import android.app.Application
import android.content.Context
import app.shamlatech.startup.R
import app.shamlatech.startup.di.DaggerViewModelInjector
import app.shamlatech.startup.di.NetworkModule
import app.shamlatech.startup.di.SharedPreferencesModule
import app.shamlatech.startup.di.ViewModelInjector
import app.shamlatech.startup.room.AppDatabase
import uk.co.chrisjenx.calligraphy.CalligraphyConfig
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper


class App : Application() {


    //lateinit var myComponent: MyComponent

    var injector: ViewModelInjector? = null

    var appDatabase: AppDatabase? = null

    override fun onCreate() {
        super.onCreate()


        /*Dagger component initialization
        * here is initialization for MyComponent
        * prefModule() is a method of MyComponent interface*/
        /* myComponent = DaggerMyComponent.builder()
             .providePrefs(PrefModule())
             .build()*/
        /*myComponent.inject(this)*/

        injector = DaggerViewModelInjector
            .builder()
            .networkModule(NetworkModule)
            .prefsModule(SharedPreferencesModule(this))
            .build()
        appDatabase=  AppDatabase.getInstance(this)
        //myComponent.inject(this)
        CalligraphyConfig.initDefault(
            CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/Hind-Regular.ttf")
                .setFontAttrId(R.attr.fontPath).build()
        )
    }


    protected override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase))
    }


}