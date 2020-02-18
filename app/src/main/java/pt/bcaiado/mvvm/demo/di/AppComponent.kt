package pt.bcaiado.mvvm.demo.di

import android.content.Context
import com.google.gson.Gson
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import okhttp3.OkHttpClient
import pt.bcaiado.core.di.NetworkModule
import pt.bcaiado.mvvm.demo.MainApplication
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    NetworkModule::class])

interface AppComponent : AndroidInjector<MainApplication> {

    @Component.Builder interface Builder {
        fun build(): AppComponent
        @BindsInstance
        fun application(application: MainApplication): Builder
    }

    fun provideContext(): Context

    fun provideOkHttpClient(): OkHttpClient
    fun provideGson(): Gson
    fun provideGsonConverterFactory(): GsonConverterFactory


}