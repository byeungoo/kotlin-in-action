package coroutine

import kotlinx.coroutines.*

/**
 * job의 cancel() 메소드를 호출하면 잡을 취소할 수 있다.
 * 더이상 필요 없는 계산을 중단시킬 수 있다.
 */
suspend fun main() {
    val squarePrinter = GlobalScope.launch(Dispatchers.Default) {
        var i = 1
        while (isActive) {
            println(i++)
        }
    }
    delay(100) // 자식 잡이 어느 정도 실행할 시간을 준다.
    squarePrinter.cancel()
}