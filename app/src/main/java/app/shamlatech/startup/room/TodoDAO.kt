package app.shamlatech.startup.room

import androidx.room.*

@Dao
interface TodoDAO {

    @Query("Select * from todoTable")
    fun getAll() : List<TodoEntity>

    @Query("Select * from todoTable where title LIKE:title")
    fun getSingleTodo(title :String) : List<TodoEntity>

    @Insert
    fun insertTodo(vararg todoEntity: TodoEntity)

    @Update
    fun updateTodo(vararg  todoEntity: TodoEntity)

    @Delete
    fun deleteTodo(todoEntity: TodoEntity)

}