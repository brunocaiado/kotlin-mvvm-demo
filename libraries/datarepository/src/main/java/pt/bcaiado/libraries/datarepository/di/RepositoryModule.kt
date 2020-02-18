package pt.bcaiado.libraries.datarepository.di

import dagger.Binds
import dagger.Module
import pt.bcaiado.libraries.datasource.BootstrapRemote
import pt.bcaiado.libraries.datasource.IBootstrapRemote

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun provideIBootstrapRemote(bootstrapRemote: BootstrapRemote) : IBootstrapRemote

    /*@Provides
    fun provideBootstrapRemote(bootstrapService: BootstrapService) : BootstrapRemote =
        BootstrapRemote(bootstrapService)*/

    /*@Provides
    fun provideBootstrapService(okhttpClient: Lazy<OkHttpClient>,
                                converterFactory: GsonConverterFactory
    ): BootstrapService =
        createRetrofit(okhttpClient, converterFactory).create(BootstrapService::class.java)

    @Provides
    fun createRetrofit(okhttpClient: Lazy<OkHttpClient>,
                               converterFactory: GsonConverterFactory ): Retrofit =
        Retrofit.Builder()
            .baseUrl("")
            .callFactory { okhttpClient.get().newCall(it) }
            .addConverterFactory(converterFactory)
            .build()*/

}