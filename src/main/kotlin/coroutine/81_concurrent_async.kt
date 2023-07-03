package coroutine

import kotlinx.coroutines.*
import java.io.File
import java.lang.Exception
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger
import kotlin.system.measureTimeMillis

/**
 * 연관성이 없는 2개의 코드를 동시에 실행하려면 명시적으로 await 같은 것을 사용한다.
 */
fun main() = runBlocking<Unit> {
    val time = measureTimeMillis {
        val one = async {doSomethingUsefulOne2()}   // async는 job을 상속한 Deferred 라는 객체임. 값 하나를 명시적으로 기다릴 수 있음
        val two =  async {doSomethingUsefulTwo2()}
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne2(): Int {
    println("doSomethingUsefulOne")
    delay(1000L)
    return 13
}

suspend fun doSomethingUsefulTwo2(): Int {
    println("doSomethingUsefulTwo")
    delay(1000L)
    return 29
}