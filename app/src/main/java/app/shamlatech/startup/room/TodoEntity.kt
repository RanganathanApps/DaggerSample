package app.shamlatech.startup.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todoTable")
data class TodoEntity(@PrimaryKey(autoGenerate = true) val id:Int,
                      @ColumnInfo val title:String,
                      @ColumnInfo  val content:String)