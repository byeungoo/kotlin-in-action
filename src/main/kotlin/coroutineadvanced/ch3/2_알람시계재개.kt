package coroutineadvanced.ch3

import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

private val executor = Executors.newSingleThreadExecutor{
    Thread(it, "scheduler").apply { isDaemon = true }
}

//suspend fun delay(timeMillis: Long): Unit =
//    suspendCoroutine<Unit> {
//        continuation -> executor.schedule({continuation.resume(Unit)}, 1000, TimeUnit.MILLISECONDS)
//    }
suspend fun main() {


    println("Before")

//    delay(1000)

    println("After")

}