package coroutine

import kotlinx.coroutines.*

/**
 * job의 join 메소드를 사용하면 조인 대상 잡이 완료될 때까지 현재 코루틴을 일시중단시킬 수 있다.
 */
fun main() {
    runBlocking {
        val job = coroutineContext[Job.Key]!!
        val jobA = launch { println("This is task A") }
        val jobB = launch { println("This is task B") }
        jobA.join()
        jobB.join()
        println("${job.children.count()} children running") // 활성화된 job이 없다.
    }
}