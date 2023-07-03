package coroutine

import kotlinx.coroutines.*
import java.lang.System

/**
 * coroutineScope() 호출로 코드 블럭을 감싸면 커스텀 영역을 도입할 수 있다. runBlocking과 마찬가지로 람다의 결과를 반환하고,
 * 자식들이 완료되기 전까지 실행이 완료되지 않는다.
 * runBlocking과 가장 큰 차이점은 coroutineScope()가 일시 중단 함수라 현재 스레드를 블럭시키지 않는다는 것이다.
 */
fun main() {
    runBlocking {
       println("Custom scope start")

        coroutineScope {
            launch {
                delay(100)
                println("Task 1 finished")
            }

            launch {
                delay(100)
                println("Task 2 finished")
            }

            delay(100)
            println("Parent task finished")
        }
        println("Custom scope end")
    }
}