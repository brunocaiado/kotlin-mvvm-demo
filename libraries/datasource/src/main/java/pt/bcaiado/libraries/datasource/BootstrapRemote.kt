package pt.bcaiado.libraries.datasource

import pt.bcaiado.libraries.datasource.api.ResultApi
import pt.bcaiado.libraries.datasource.dto.bootstrap.BootstrapDto
import retrofit2.Response
import java.io.IOException
import javax.inject.Inject

class BootstrapRemote @Inject constructor(val bootstrapService: BootstrapService) : IBootstrapRemote {


    //private var service : BootstrapService = retrofit.create(BootstrapService::class.java)

    override suspend fun getBootstrap(): ResultApi<BootstrapDto> {
        return try {

            val response = bootstrapService.getBootstrap()
            getResult(response = response, onError = {
                ResultApi.Error(
                    IOException("Error getting stories ${response.code()} ${response.message()}"),
                    "ocorreu um pequeno problema"
                )
            })
        } catch (e: Exception) {
            ResultApi.Error(IOException("Error getting stories", e), "ocorreu um pequeno problema")
        }
    }


    private inline fun getResult(
        response: Response<BootstrapDto>,
        onError: () -> ResultApi.Error
    ): ResultApi<BootstrapDto> {
        if (response.isSuccessful) {
            val body = response.body()
            if (body != null) {
                return ResultApi.Success(body)
            }
        }else{
            //return ResultApi.Error()
        }

        return onError.invoke()
    }

}