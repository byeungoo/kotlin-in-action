package coroutine

import kotlinx.coroutines.*

/**
 * 부모스레드가 취소되면 자동으로 모든 자식의 실행을 취소한다.
 */
fun main() {
    runBlocking {
        val parentJob = GlobalScope.launch {
            println("Parent started")

            launch {
                println("Child 1 started")
                delay(500)
                println("Child 1 completed")
            }


            launch {
                println("Child 2 started")
                delay(500)
                println("Child 2 completed")
            }

            delay(500)
            println("Parent completed")
        }
        delay(100)
        parentJob.cancel()
    }
}