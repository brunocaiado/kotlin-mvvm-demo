package pt.bcaiado.welcome.usecases

import android.util.Log
import pt.bcaiado.libraries.datarepository.BootstrapRepository
import pt.bcaiado.libraries.datarepository.ResultRepo
import javax.inject.Inject

class UserLoggedUseCase @Inject constructor(var bootstrapRepository: BootstrapRepository) {

    suspend fun getBootstrap() {
        var bootstrapResult = bootstrapRepository.getBootstrap()


        when (bootstrapResult) {

            is ResultRepo.Success -> {

                bootstrapResult.data.bruno

                Log.d("bcaiado", bootstrapResult.data.bruno)

            }
            //loginManager.setup(bootstrapResult.data)*/
        }
    }

}