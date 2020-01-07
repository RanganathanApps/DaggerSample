package app.shamlatech.startup.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lapp/shamlatech/startup/di/ViewModelInjector;", "", "inject", "", "postListViewModel", "Lapp/shamlatech/startup/viewmodel/PostListViewModel;", "Builder", "app_debug"})
@dagger.Component(modules = {app.shamlatech.startup.di.NetworkModule.class, app.shamlatech.startup.di.SharedPreferencesModule.class})
@javax.inject.Singleton()
public abstract interface ViewModelInjector {
    
    /**
     * Injects required dependencies into the specified PostListViewModel.
     * @param postListViewModel PostListViewModel in which to inject the dependencies
     */
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    app.shamlatech.startup.viewmodel.PostListViewModel postListViewModel);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lapp/shamlatech/startup/di/ViewModelInjector$Builder;", "", "build", "Lapp/shamlatech/startup/di/ViewModelInjector;", "networkModule", "Lapp/shamlatech/startup/di/NetworkModule;", "prefsModule", "sharedPreferencesModule", "Lapp/shamlatech/startup/di/SharedPreferencesModule;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.shamlatech.startup.di.ViewModelInjector build();
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.shamlatech.startup.di.ViewModelInjector.Builder networkModule(@org.jetbrains.annotations.NotNull()
        app.shamlatech.startup.di.NetworkModule networkModule);
        
        @org.jetbrains.annotations.NotNull()
        public abstract app.shamlatech.startup.di.ViewModelInjector.Builder prefsModule(@org.jetbrains.annotations.NotNull()
        app.shamlatech.startup.di.SharedPreferencesModule sharedPreferencesModule);
    }
}