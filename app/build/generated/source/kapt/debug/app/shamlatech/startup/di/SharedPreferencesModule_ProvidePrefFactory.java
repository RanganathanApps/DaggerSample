// Generated by Dagger (https://google.github.io/dagger).
package app.shamlatech.startup.di;

import android.content.SharedPreferences;
import apps.ranganathan.configlibrary.utils.PrefsManger;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class SharedPreferencesModule_ProvidePrefFactory implements Factory<PrefsManger> {
  private final SharedPreferencesModule module;

  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SharedPreferencesModule_ProvidePrefFactory(
      SharedPreferencesModule module, Provider<SharedPreferences> sharedPreferencesProvider) {
    this.module = module;
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public PrefsManger get() {
    return provideInstance(module, sharedPreferencesProvider);
  }

  public static PrefsManger provideInstance(
      SharedPreferencesModule module, Provider<SharedPreferences> sharedPreferencesProvider) {
    return proxyProvidePref(module, sharedPreferencesProvider.get());
  }

  public static SharedPreferencesModule_ProvidePrefFactory create(
      SharedPreferencesModule module, Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SharedPreferencesModule_ProvidePrefFactory(module, sharedPreferencesProvider);
  }

  public static PrefsManger proxyProvidePref(
      SharedPreferencesModule instance, SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNull(
        instance.providePref(sharedPreferences),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
