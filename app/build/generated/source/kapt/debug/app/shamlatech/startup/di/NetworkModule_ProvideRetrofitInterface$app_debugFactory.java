// Generated by Dagger (https://google.github.io/dagger).
package app.shamlatech.startup.di;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import retrofit2.Retrofit;

public final class NetworkModule_ProvideRetrofitInterface$app_debugFactory
    implements Factory<Retrofit> {
  private static final NetworkModule_ProvideRetrofitInterface$app_debugFactory INSTANCE =
      new NetworkModule_ProvideRetrofitInterface$app_debugFactory();

  @Override
  public Retrofit get() {
    return provideInstance();
  }

  public static Retrofit provideInstance() {
    return proxyProvideRetrofitInterface$app_debug();
  }

  public static NetworkModule_ProvideRetrofitInterface$app_debugFactory create() {
    return INSTANCE;
  }

  public static Retrofit proxyProvideRetrofitInterface$app_debug() {
    return Preconditions.checkNotNull(
        NetworkModule.provideRetrofitInterface$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
