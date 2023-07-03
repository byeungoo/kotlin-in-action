package coroutine

import kotlinx.coroutines.*
import java.io.File
import java.lang.Exception
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

/**
 * exception이 발생해도 코루틴이 계속 실행됨
 */
fun main() = runBlocking<Unit> {
    try {
        val time = measureTimeMillis {
            val one = doSomethingUsefulOneAsync()
            val two = doSomethingUsefulTwoAsync()

            println("my exceptions")
            throw Exception("my exceptions")

            runBlocking {
                println("The answer is ${one.await() + two.await()}")
            }
        }
        println("Completed in $time ms")
    } catch (e:Exception) {

    }

}

fun doSomethingUsefulOneAsync() = GlobalScope.async {
    println("start, somethingUsefulOneAsync")
    val res = doSomethingUsefulOne4()
    println("end, somethingUsefulOneAsync")
    res
}

fun doSomethingUsefulTwoAsync() = GlobalScope.async {
    println("start, somethingUsefulTwoAsync")
    val res = doSomethingUsefulTwo4()
    println("end, somethingUsefulTwoAsync")
    res
}

suspend fun doSomethingUsefulOne4(): Int {
    println("doSomethingUsefulOne")
    delay(3000L)
    return 29
}

suspend fun doSomethingUsefulTwo4(): Int {
    println("doSomethingUsefulTwo")
    delay(3000L)
    return 29
}