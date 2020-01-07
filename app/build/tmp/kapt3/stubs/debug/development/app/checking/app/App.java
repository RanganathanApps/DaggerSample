package development.app.checking.app;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u0014"}, d2 = {"Ldevelopment/app/checking/app/App;", "Landroid/app/Application;", "()V", "appDatabase", "Lapp/shamlatech/startup/room/AppDatabase;", "getAppDatabase", "()Lapp/shamlatech/startup/room/AppDatabase;", "setAppDatabase", "(Lapp/shamlatech/startup/room/AppDatabase;)V", "injector", "Lapp/shamlatech/startup/di/ViewModelInjector;", "getInjector", "()Lapp/shamlatech/startup/di/ViewModelInjector;", "setInjector", "(Lapp/shamlatech/startup/di/ViewModelInjector;)V", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "onCreate", "app_debug"})
public final class App extends android.app.Application {
    @org.jetbrains.annotations.Nullable()
    private app.shamlatech.startup.di.ViewModelInjector injector;
    @org.jetbrains.annotations.Nullable()
    private app.shamlatech.startup.room.AppDatabase appDatabase;
    
    @org.jetbrains.annotations.Nullable()
    public final app.shamlatech.startup.di.ViewModelInjector getInjector() {
        return null;
    }
    
    public final void setInjector(@org.jetbrains.annotations.Nullable()
    app.shamlatech.startup.di.ViewModelInjector p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final app.shamlatech.startup.room.AppDatabase getAppDatabase() {
        return null;
    }
    
    public final void setAppDatabase(@org.jetbrains.annotations.Nullable()
    app.shamlatech.startup.room.AppDatabase p0) {
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    protected void attachBaseContext(@org.jetbrains.annotations.NotNull()
    android.content.Context newBase) {
    }
    
    public App() {
        super();
    }
}