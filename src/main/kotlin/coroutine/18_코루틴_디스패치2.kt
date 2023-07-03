package coroutine

import kotlinx.coroutines.*
import java.io.File
import java.lang.Exception
import java.util.concurrent.ScheduledThreadPoolExecutor
import java.util.concurrent.atomic.AtomicInteger

/**
 * 코루틴 디스패처는 병렬 작업 사이에 스레드를 배분해주는 자바 실행기 (executor) 역할을 한다.
 * asCoroutineDispatcher() 확장 함수를 사용하면 기존 실행기 구현을 그에 상응하는 코루틴 디스패처로 쉽게 바꿀 수 있다.
 */
fun main() {
    val id = AtomicInteger(0)

    val executor = ScheduledThreadPoolExecutor(5) {runnable ->
        Thread(
            runnable,
            "WorkerThread-${id.incrementAndGet()}"
        ).also { it.isDaemon = true }
    }

    executor.asCoroutineDispatcher().use { dispatcher ->
        runBlocking {
            for(i in 1..3) {
                launch(dispatcher) {
                    println(Thread.currentThread().name)
                    delay(1000)
                }
            }
        }
    }
}