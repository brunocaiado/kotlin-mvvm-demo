package pt.bcaiado.welcome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import pt.bcaiado.welcome.usecases.UserLoggedUseCase
import javax.inject.Inject

class WelcomeViewModel @Inject constructor(private val userLoggedUseCase: UserLoggedUseCase): ViewModel(){



    init{
        //_welcomeUiStatus.value = WelcomeStatusUiModel.Loading

        startApp()
    }

    private fun startApp()= viewModelScope.launch (Dispatchers.Default) {

        //userLoggedUseCase
        userLoggedUseCase.getBootstrap()

    }

}