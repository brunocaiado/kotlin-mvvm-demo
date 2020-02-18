package pt.bcaiado.welcome.di

import android.app.Activity
import dagger.Module
import dagger.Provides
import pt.bcaiado.welcome.WelcomeFragment

@Module
class WelcomeModule {

    @Provides
    fun provideActivity(welcomeFragment: WelcomeFragment) : Activity = welcomeFragment.activity as Activity

}