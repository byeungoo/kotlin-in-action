package coroutine

import kotlinx.coroutines.*
import java.lang.System

/**
 * Job : 잡은 동시성 작업의 생명 주기를 표현하는 객체다.
 *  new, active , completing, completed, cancelling, canceled
 *  기본값은 생성하자마자 시작하자마자 실행하는 active이다.
 */
fun main() {
    runBlocking {
       val job = launch(start = CoroutineStart.LAZY) { // LAZY로 Job을 자동으로 실행하지 말라고할 수 있다.
           println("Job started")
       }
        delay(100)
        println("Preparing to start...")
        job.start() // join 또는 start 시에 잡이 활성화된다.
    }
}