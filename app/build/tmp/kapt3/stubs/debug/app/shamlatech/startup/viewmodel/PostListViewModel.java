package app.shamlatech.startup.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\r\u0010&\u001a\u00020\'H\u0000\u00a2\u0006\u0002\b(J\r\u0010)\u001a\u00020\'H\u0000\u00a2\u0006\u0002\b*J\b\u0010+\u001a\u00020\'H\u0007J\u0016\u0010,\u001a\u00020\'2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002J\u0010\u0010-\u001a\u00020\'2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002J\u0016\u0010.\u001a\u00020\'2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u001cH\u0002J\u0015\u0010/\u001a\u00020\u000b2\u0006\u00100\u001a\u000201H\u0000\u00a2\u0006\u0002\b2J\r\u00103\u001a\u00020\'H\u0000\u00a2\u0006\u0002\b4R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR&\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0\u001c0\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\t\u00a8\u00065"}, d2 = {"Lapp/shamlatech/startup/viewmodel/PostListViewModel;", "Lapp/shamlatech/startup/viewmodel/BaseViewModel;", "()V", "complexString", "Landroidx/lifecycle/MutableLiveData;", "", "getComplexString", "()Landroidx/lifecycle/MutableLiveData;", "setComplexString", "(Landroidx/lifecycle/MutableLiveData;)V", "isLoading", "", "setLoading", "mPrefsMangers", "Lapp/shamlatech/startup/Pref/PrefsMangers;", "getMPrefsMangers", "()Lapp/shamlatech/startup/Pref/PrefsMangers;", "setMPrefsMangers", "(Lapp/shamlatech/startup/Pref/PrefsMangers;)V", "myCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "postApi", "Lapp/shamlatech/startup/di/PostApi;", "getPostApi", "()Lapp/shamlatech/startup/di/PostApi;", "setPostApi", "(Lapp/shamlatech/startup/di/PostApi;)V", "posts", "", "Lapp/shamlatech/startup/model/Post;", "getPosts", "setPosts", "postsRepo", "Lapp/shamlatech/startup/repository/PostsRepo;", "users", "Lapp/shamlatech/startup/model/User;", "getUsers", "setUsers", "getAllPosts", "", "getAllPosts$app_debug", "getAllUsers", "getAllUsers$app_debug", "getComplexDetails", "handleResponse", "handleResponse2", "handleResponseUsers", "insertTodo", "appDatabase", "Lapp/shamlatech/startup/room/AppDatabase;", "insertTodo$app_debug", "loadRepository", "loadRepository$app_debug", "app_debug"})
public final class PostListViewModel extends app.shamlatech.startup.viewmodel.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public app.shamlatech.startup.di.PostApi postApi;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public app.shamlatech.startup.Pref.PrefsMangers mPrefsMangers;
    private app.shamlatech.startup.repository.PostsRepo postsRepo;
    private io.reactivex.disposables.CompositeDisposable myCompositeDisposable;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<app.shamlatech.startup.model.Post>> posts;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.util.List<app.shamlatech.startup.model.User>> users;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<java.lang.String> complexString;
    
    @org.jetbrains.annotations.NotNull()
    public final app.shamlatech.startup.di.PostApi getPostApi() {
        return null;
    }
    
    public final void setPostApi(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.di.PostApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final app.shamlatech.startup.Pref.PrefsMangers getMPrefsMangers() {
        return null;
    }
    
    public final void setMPrefsMangers(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.Pref.PrefsMangers p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<app.shamlatech.startup.model.Post>> getPosts() {
        return null;
    }
    
    public final void setPosts(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<app.shamlatech.startup.model.Post>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<app.shamlatech.startup.model.User>> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.util.List<app.shamlatech.startup.model.User>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void setLoading(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getComplexString() {
        return null;
    }
    
    public final void setComplexString(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.String> p0) {
    }
    
    public final boolean insertTodo$app_debug(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.room.AppDatabase appDatabase) {
        return false;
    }
    
    public final void loadRepository$app_debug() {
    }
    
    public final void getAllPosts$app_debug() {
    }
    
    private final void handleResponse(java.util.List<app.shamlatech.startup.model.Post> posts) {
    }
    
    private final void handleResponseUsers(java.util.List<app.shamlatech.startup.model.User> users) {
    }
    
    private final void handleResponse2(java.lang.String posts) {
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    public final void getComplexDetails() {
    }
    
    public final void getAllUsers$app_debug() {
    }
    
    public PostListViewModel() {
        super();
    }
}