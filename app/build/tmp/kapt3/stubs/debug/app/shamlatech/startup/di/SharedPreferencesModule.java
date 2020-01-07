package app.shamlatech.startup.di;

import java.lang.System;

@kotlin.Suppress(names = {"unused"})
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\f"}, d2 = {"Lapp/shamlatech/startup/di/SharedPreferencesModule;", "", "app", "Ldevelopment/app/checking/app/App;", "(Ldevelopment/app/checking/app/App;)V", "getApp", "()Ldevelopment/app/checking/app/App;", "providePref", "Lapps/ranganathan/configlibrary/utils/PrefsManger;", "sharedPreferences", "Landroid/content/SharedPreferences;", "providePreferences", "app_debug"})
@dagger.Module()
public final class SharedPreferencesModule {
    @org.jetbrains.annotations.NotNull()
    private final development.app.checking.app.App app = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final apps.ranganathan.configlibrary.utils.PrefsManger providePref(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences providePreferences() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final development.app.checking.app.App getApp() {
        return null;
    }
    
    public SharedPreferencesModule(@org.jetbrains.annotations.NotNull()
    development.app.checking.app.App app) {
        super();
    }
}