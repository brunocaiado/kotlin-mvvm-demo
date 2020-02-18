package pt.bcaiado.libraries.datasource

import pt.bcaiado.libraries.datasource.dto.bootstrap.BootstrapDto
import retrofit2.Response
import retrofit2.http.GET

interface BootstrapService {

    @GET("")
    suspend fun getBootstrap(): Response<BootstrapDto>

}