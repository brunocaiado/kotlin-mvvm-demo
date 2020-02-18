package pt.bcaiado.libraries.datasource

import pt.bcaiado.libraries.datasource.api.ResultApi
import pt.bcaiado.libraries.datasource.dto.bootstrap.BootstrapDto

interface IBootstrapRemote {

    suspend fun getBootstrap() : ResultApi<BootstrapDto>

}