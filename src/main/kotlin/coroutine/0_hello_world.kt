package coroutine

import kotlinx.coroutines.*

fun main() = runBlocking { // this: CoroutineScope
    val job = launch { // launch a new coroutine and continue
        // delay는 suspend 함수이므로 launch는 일시 중단되며 메인쓰레드가 계속 실행된다. 그리고 1초 뒤에 World!가 콘솔에 출력된다.
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println("World!") // print after delay
    }
    println("Hello") // main coroutine continues while a previous one is delayed
}