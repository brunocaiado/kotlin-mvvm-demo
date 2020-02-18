package pt.bcaiado.libraries.datasource.api

sealed class ResultApi<out T : Any> {

    data class Success<out T : Any>(val data: T) : ResultApi<T>()
    data class Error(val exception: Exception, val noserror : String) : ResultApi<Nothing>()


    override fun toString(): String {
        return when (this) {
            is Success<*> -> "Success[data=$data]"
            is Error -> "Error[exception=$exception]"
        }
    }
}