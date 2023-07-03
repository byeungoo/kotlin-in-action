package coroutine

import kotlinx.coroutines.*
import java.lang.System

/**
 * 코루틴을 실행할 때 사용하는 여러 가지 함수를 코루틴 빌더라고 부른다.
 * GlobalScope : 독립적인 코루틴을 만들 수 있고, 자신만의 작업을 내포할 수 있다. (CoroutineScope 기본적인 구현체)
 *  - launch : 작업 결과가 필요없을 경우 사용
 */
fun main() {

    val time = System.currentTimeMillis()

    // 2개의 작업이 병렬적으로 실행되며 둘중 어느쪽이 먼저 더 표시될 수 있다.
    GlobalScope.launch {
        delay(1000) // Task2가 실행됨 (비동기)
        println("Task 1 finished in ${System.currentTimeMillis() - time} ms")
    }

    GlobalScope.launch {
        delay(1000)
        println("Task 2 finished in ${System.currentTimeMillis() - time} ms")
    }

    // 코틀린 내부에서 Thread sleep 과 같은 코드를 사용하면 코루틴 사용 목적에 위배된다.
    // 동시성 작업의 내부에서는 임시 중단 함수인 delay를 사용해야한다.
    Thread.sleep(2000)
}