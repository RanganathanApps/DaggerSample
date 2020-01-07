package app.shamlatech.startup.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\nH\'J!\u0010\u000b\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\f\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000f"}, d2 = {"Lapp/shamlatech/startup/room/TodoDAO;", "", "deleteTodo", "", "todoEntity", "Lapp/shamlatech/startup/room/TodoEntity;", "getAll", "", "getSingleTodo", "title", "", "insertTodo", "", "([Lapp/shamlatech/startup/room/TodoEntity;)V", "updateTodo", "app_debug"})
public abstract interface TodoDAO {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from todoTable")
    public abstract java.util.List<app.shamlatech.startup.room.TodoEntity> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "Select * from todoTable where title LIKE:title")
    public abstract java.util.List<app.shamlatech.startup.room.TodoEntity> getSingleTodo(@org.jetbrains.annotations.NotNull()
    java.lang.String title);
    
    @androidx.room.Insert()
    public abstract void insertTodo(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.room.TodoEntity... todoEntity);
    
    @androidx.room.Update()
    public abstract void updateTodo(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.room.TodoEntity... todoEntity);
    
    @androidx.room.Delete()
    public abstract void deleteTodo(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.room.TodoEntity todoEntity);
}