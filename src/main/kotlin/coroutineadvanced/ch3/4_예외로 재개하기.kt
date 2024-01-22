package coroutineadvanced.ch3

import kotlinx.coroutines.suspendCancellableCoroutine
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

class MyException: Throwable("Just an exception")

suspend fun main() {

//    try {
//        suspendCoroutine<Unit> { cont -> cont.resumeWithException(MyException()) }
//    } catch (e: MyException) {
//        println("Caught!")
//    }

}

//suspend fun requestUser(): User {
//    return suspendCancellableCoroutine<User> { cont ->
//        requestUser{
//            resp -> if(resp.isSuccessful) {
//                cont.resume(resp.data)
//        } else {
//            val e = ApiException(resp.code, resp.message)
//            cont.resumeWithException(e)
//        }
//    }
//}