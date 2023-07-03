package coroutine

import kotlinx.coroutines.*
import java.io.File
import java.lang.Exception
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

/**
 * async lazy 방식으로 실행
 */
fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) {doSomethingUsefulOne3()}
        val two =  async(start = CoroutineStart.LAZY) {doSomethingUsefulTwo3()}
        one.start()
        two.start()
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne3(): Int {
    println("doSomethingUsefulOne")
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo3(): Int {
    println("doSomethingUsefulTwo")
    delay(1000L)
    return 29
}