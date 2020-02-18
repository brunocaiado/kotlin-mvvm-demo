package pt.bcaiado.libraries.datarepository

import pt.bcaiado.libraries.datasource.api.ResultApi

sealed class ResultRepo<out T : Any>() {

    //data class Success<out T : Any>(val data: T) : ResultApi<T>(){}

    data class Success<out T : Any>(private val dataHelper: ResultApi.Success<T>) : ResultRepo<T>(){
        val data = dataHelper.data
    }


    data class Saved<out T : Any>(val data: T) : ResultRepo<T>()
    data class Error(val exception: Exception, val noserror : String) : ResultRepo<Nothing>()

    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Saved<*> -> "Saved[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}