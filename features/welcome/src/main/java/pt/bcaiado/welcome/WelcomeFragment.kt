package pt.bcaiado.welcome

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import pt.bcaiado.mvvm.demo.coreComponent
import pt.bcaiado.welcome.di.DaggerWelcomeComponent
import javax.inject.Inject

class WelcomeFragment : Fragment() {

    @Inject
    lateinit var welcomeViewModel: WelcomeViewModel

    override fun onAttach(context: Context) {
        DaggerWelcomeComponent.builder()
            .coreComponent(coreComponent())
            .welcomeFragment(this)
            .build()
            .inject(this)

        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        return inflater.inflate(R.layout.fragment_welcome, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


    }

}
