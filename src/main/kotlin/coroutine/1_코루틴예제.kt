package coroutine

import ch6.fail
import kotlinx.coroutines.*

fun main() {
    println("시작")
    runBlocking {
        val a = launch {
            for(i in 1..5) {
                println(i)
                delay(10)
            }
        }

        val b = async {
            "async 종료"
        }
        println("async 대기")
        println(b.await())

        println("launch 대기")
        a.join()
        println("launch 종료")
    }
    println("종료")
}