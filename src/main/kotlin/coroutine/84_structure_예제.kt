package coroutine

import kotlinx.coroutines.*
import java.io.File
import java.lang.Exception
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

/**
 * 코루틴 스코프 안에서 exception이 발생하기 때문에 코루틴들이 취소가 된다.
 */
fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        println("The answer is ${concurrentSum()}")
    }
    println("Completed in $time ms")
}

suspend fun concurrentSum(): Int = coroutineScope {
    val one = async { doSomethingUsefulOne5() }
    val two = async { doSomethingUsefulTwo5() }

    delay(10)
    kotlin.io.println("Exception")
    throw Exception()

    one.await() + two.await()
}


suspend fun doSomethingUsefulOne5(): Int {
    kotlin.io.println("start, doSomethingUsefulOne")
    delay(1000L)
    kotlin.io.println("end, doSomethingUsefulOne")
    return 29
}

suspend fun doSomethingUsefulTwo5(): Int {
    kotlin.io.println("start, doSomethingUsefulOne")
    delay(1000L)
    kotlin.io.println("end, doSomethingUsefulOne")
    return 29
}