package app.shamlatech.startup.di

import android.content.Context
import android.content.SharedPreferences
import apps.ranganathan.configlibrary.utils.PrefsManger
import dagger.Module
import dagger.Provides
import development.app.checking.app.App
import javax.inject.Singleton


@Module
// Safe here as we are dealing with a Dagger 2 module
@Suppress("unused")
class SharedPreferencesModule(val app: App) {


    @Provides
    @Singleton
    fun providePref(sharedPreferences: SharedPreferences): PrefsManger {
        return PrefsManger(sharedPreferences)
    }

    @Provides
    @Singleton
    fun providePreferences(): SharedPreferences {
        return app.getSharedPreferences("appName", Context.MODE_PRIVATE)
    }


}