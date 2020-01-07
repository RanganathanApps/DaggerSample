package app.shamlatech.startup.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lapp/shamlatech/startup/repository/PostsRepo;", "Lapp/shamlatech/startup/repository/BaseRepository;", "postApi", "Lapp/shamlatech/startup/di/PostApi;", "(Lapp/shamlatech/startup/di/PostApi;)V", "getPostApi", "()Lapp/shamlatech/startup/di/PostApi;", "loadPosts", "Lio/reactivex/Maybe;", "", "Lapp/shamlatech/startup/model/Post;", "loadUsers", "Lapp/shamlatech/startup/model/User;", "app_debug"})
public class PostsRepo extends app.shamlatech.startup.repository.BaseRepository {
    @org.jetbrains.annotations.NotNull()
    private final app.shamlatech.startup.di.PostApi postApi = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<app.shamlatech.startup.model.Post>> loadPosts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Maybe<java.util.List<app.shamlatech.startup.model.User>> loadUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.shamlatech.startup.di.PostApi getPostApi() {
        return null;
    }
    
    public PostsRepo(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.di.PostApi postApi) {
        super();
    }
}