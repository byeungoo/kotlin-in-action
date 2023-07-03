package coroutine

import kotlinx.coroutines.*
import java.lang.Exception
import kotlin.system.measureTimeMillis

/**
 * 코루틴 exception 전파. 두번째 코루틴에 의해서 첫번째 코루틴이 실행되다가 실패된다.
 */
fun main() = runBlocking<Unit> {
    try {
        failedConcurrentSum()
    } catch (e: ArithmeticException) {
        println("Computation failed with ArithmeticException")
    }
}

suspend fun failedConcurrentSum(): Int = coroutineScope {
    val one = async<Int> {
        try {
            delay(Long.MAX_VALUE)
            42
        } finally {
            println("First child was cancelled")
        }
    }
    val two = async<Int> {
        println("Second child throws an exception")
        throw ArithmeticException()
    }
    one.await() + two.await()
}