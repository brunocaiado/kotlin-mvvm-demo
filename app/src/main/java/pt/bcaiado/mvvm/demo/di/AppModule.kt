package pt.bcaiado.mvvm.demo.di

import android.content.Context
import dagger.Module
import dagger.Provides
import pt.bcaiado.mvvm.demo.MainApplication

@Module
class AppModule {

    @Provides
    fun provideContext(application: MainApplication): Context = application.applicationContext

}