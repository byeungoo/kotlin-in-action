package coroutine

import kotlinx.coroutines.*

/**
 * 신규 job은 기존 job의 자식이 된다.
 */
fun main() {
    runBlocking {
       val job = coroutineContext[Job.Key]!!
        launch { println("This is task A") }
        launch { println("This is task B") }

        // children running
        println("${job.children.count()} children running")
    }
}