package pt.bcaiado.welcome.di

import android.app.Activity
import dagger.BindsInstance
import dagger.Component
import pt.bcaiado.core.di.FeatureScope
import pt.bcaiado.mvvm.demo.di.AppComponent
import pt.bcaiado.libraries.datarepository.di.RepositoryModule
import pt.bcaiado.welcome.WelcomeFragment

@FeatureScope
@Component(
    dependencies = [AppComponent::class],
    modules = [WelcomeModule::class, RepositoryModule::class]
)
interface WelcomeComponent{

    @Component.Builder
    interface Builder {

        fun build(): WelcomeComponent
        fun coreComponent(module: AppComponent): Builder
        @BindsInstance
        fun welcomeFragment(fragment: WelcomeFragment): Builder

    }

    fun provideActivity() : Activity

    fun inject(fragment : WelcomeFragment)

}