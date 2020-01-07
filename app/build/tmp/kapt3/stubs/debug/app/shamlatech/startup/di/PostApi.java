package app.shamlatech.startup.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H\'\u00a8\u0006\b"}, d2 = {"Lapp/shamlatech/startup/di/PostApi;", "", "getPosts", "Lio/reactivex/Maybe;", "", "Lapp/shamlatech/startup/model/Post;", "getUsers", "Lapp/shamlatech/startup/model/User;", "app_debug"})
public abstract interface PostApi {
    
    /**
     * Get the list of the pots from the API
     */
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/posts")
    public abstract io.reactivex.Maybe<java.util.List<app.shamlatech.startup.model.Post>> getPosts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "/users")
    public abstract io.reactivex.Maybe<java.util.List<app.shamlatech.startup.model.User>> getUsers();
}