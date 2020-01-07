package app.shamlatech.startup.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//@Database(entities = [TodoEntity::class],version = 1)
@Database(entities = arrayOf(TodoEntity::class),version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun todoDAO(): TodoDAO

    companion object{
        private var INSTANCE : AppDatabase? = null
        private val LOCK = Any()


        fun getInstance(context: Context) : AppDatabase{

            if (INSTANCE == null){
                INSTANCE = Room.databaseBuilder(context.applicationContext,
                    AppDatabase::class.java,
                    "todoDB.db").allowMainThreadQueries()
                    .build()
            }
            return INSTANCE!!
        }
    }
}
