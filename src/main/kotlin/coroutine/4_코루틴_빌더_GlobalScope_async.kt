package coroutine

import kotlinx.coroutines.*
import java.lang.System

/**
 * await : await() 메서드를 호출하면 await()는 계산이 완료되거나 계산 작업이 취소될 때까지 현재 코루틴을 일시 중단한다.
 *        취소될 경우 예외를 발생하며 실패한다. 자바의 퓨처에 해당하는 코루틴 빌더라고 생각할 수 있다.
 */
suspend fun main() {

    val message = GlobalScope.async {
        delay(100)
        "abc"
    }

    val count = GlobalScope.async {
        delay(100)
        1 + 2
    }

    delay(200)

    val result = message.await().repeat(count.await())
    println(result) // abcabcabc 출력
}