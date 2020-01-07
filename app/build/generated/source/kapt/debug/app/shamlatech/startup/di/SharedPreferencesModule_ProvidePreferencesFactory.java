// Generated by Dagger (https://google.github.io/dagger).
package app.shamlatech.startup.di;

import android.content.SharedPreferences;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

public final class SharedPreferencesModule_ProvidePreferencesFactory
    implements Factory<SharedPreferences> {
  private final SharedPreferencesModule module;

  public SharedPreferencesModule_ProvidePreferencesFactory(SharedPreferencesModule module) {
    this.module = module;
  }

  @Override
  public SharedPreferences get() {
    return provideInstance(module);
  }

  public static SharedPreferences provideInstance(SharedPreferencesModule module) {
    return proxyProvidePreferences(module);
  }

  public static SharedPreferencesModule_ProvidePreferencesFactory create(
      SharedPreferencesModule module) {
    return new SharedPreferencesModule_ProvidePreferencesFactory(module);
  }

  public static SharedPreferences proxyProvidePreferences(SharedPreferencesModule instance) {
    return Preconditions.checkNotNull(
        instance.providePreferences(), "Cannot return null from a non-@Nullable @Provides method");
  }
}
