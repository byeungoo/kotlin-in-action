package coroutine

import kotlinx.coroutines.*

/**
 * Thread.yield()를 호출하면 현재 스레드를 일시 중단시키고 다른 스레드가 실행될 수 있는 기회를 부여하는 것과 같다.
 */
suspend fun main() {
    val squarePrinter = GlobalScope.launch(Dispatchers.Default) {
        var i = 1
        while (true) {
            yield() // 실행중인 잡을 일시 중단 시켜서 자신을 실행 중인 스레드를 다른 코루틴에게 양보한다.
            println(i++)
        }
    }
    delay(100) // 자식 잡이 어느 정도 실행할 시간을 준다.
    squarePrinter.cancel()
}