package coroutine

import ch6.fail
import kotlinx.coroutines.*

suspend fun foo() { // suspend를 붙여서 일시 중단 함수로 만든다. 일시 중단 함수는 일시 중단함수가 호출 할 수 있다.
    println("Task started")
    delay(100)  // 현재 스레드를 블럭시키지 않고 자신을 호출한 함수를 일시 중단하며 스레드가 다른 작업을 수행할 수 있게 해준다.
    println("Task finished")
}

suspend fun main() {
    println("Task started")
    delay(1000)
    println("Task finished")
}