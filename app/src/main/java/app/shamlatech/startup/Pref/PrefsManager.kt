package app.shamlatech.startup.Pref

import android.content.Context
import android.content.SharedPreferences
import dagger.Provides
import javax.inject.Inject


class PrefsMangers @Inject constructor(private val sharedPreferences: SharedPreferences) {




    /*insert*/
    fun putData(key: String, value: Any) {
        when (value){
            is String ->sharedPreferences.edit().putString(key, value).apply()
            is Int ->sharedPreferences.edit().putInt(key, value).apply()
            is Float ->sharedPreferences.edit().putFloat(key, value).apply()
            is Long ->sharedPreferences.edit().putLong(key, value).apply()
            is Boolean ->sharedPreferences.edit().putBoolean(key, value).apply()
        }
    }

    /*retrieve*/
    fun getData(key: String,type: Any) : Any? {

        return when (type){
            is String ->sharedPreferences.getString(key, "")
            is Int ->sharedPreferences.getInt(key,0)
            is Float ->sharedPreferences.getFloat(key, 0f)
            is Long ->sharedPreferences.getLong(key, 0)
            is Boolean ->sharedPreferences.getBoolean(key, false)
            else ->{
                sharedPreferences.getString(key, "")
            }
        }


    }

    /*insert string*/
    fun getString(key: String, value: String) {
        sharedPreferences.getString(key, value)
    }

    /*insert string*/
    fun getInt(key: String, value: Int) {
        sharedPreferences.getInt(key, value)
    }
}