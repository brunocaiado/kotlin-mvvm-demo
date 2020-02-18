package pt.bcaiado.libraries.datarepository

import pt.bcaiado.libraries.datasource.IBootstrapRemote
import pt.bcaiado.libraries.datasource.api.ResultApi
import pt.bcaiado.libraries.datasource.dto.bootstrap.BootstrapDto
import javax.inject.Inject

class BootstrapRepository @Inject constructor(var iBootstrapRemote: IBootstrapRemote){

    suspend fun getBootstrap() : ResultRepo<BootstrapDto> {

        var result = iBootstrapRemote.getBootstrap()

        return ResultRepo.Success(result as ResultApi.Success)


        /*when(result){
            is ResultApi.Success -> {
                 ResultRepo.Success(result)
            }
        }

        return ResultRepo.Success()*/



    }

}