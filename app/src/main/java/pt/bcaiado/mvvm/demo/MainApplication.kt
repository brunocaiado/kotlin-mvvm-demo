package pt.bcaiado.mvvm.demo

import android.content.Context
import androidx.fragment.app.Fragment
import dagger.android.DaggerApplication
import pt.bcaiado.mvvm.demo.di.DaggerAppComponent


class MainApplication : DaggerApplication() {

    companion object {
        @JvmStatic
        fun coreComponent(context: Context) =
            (context.applicationContext as MainApplication).applicationInjector()
    }

    override fun applicationInjector() = DaggerAppComponent.builder()
        .application(this)
        .build()

}

fun Fragment.coreComponent() = MainApplication.coreComponent(this.context!!)