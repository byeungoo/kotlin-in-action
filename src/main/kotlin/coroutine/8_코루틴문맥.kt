package coroutine

import kotlinx.coroutines.*
import java.lang.System

fun main() {
    GlobalScope.launch {
        // 현재 잡을 얻고 출력
        println("Task is active : ${coroutineContext[Job.Key]!!.isActive}") // StandaloneCoroutine
    }
    Thread.sleep(1000)
}