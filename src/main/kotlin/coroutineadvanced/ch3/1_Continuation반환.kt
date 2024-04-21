package coroutineadvanced.ch3

import coroutine.log
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread
import kotlin.coroutines.Continuation
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

suspend fun main() {

    log("Before")

//    // 1. Before만 출력
//    suspendCoroutine<Unit> { }
//
//    // 2. Before, Before too 출력. 인자로 들어간 람다 함수는 중단되기전에 실행
//    suspendCoroutine<Unit> {
//         continuation -> println("Before too")
//    }
//
//    // 3. Before, After 출력
//    suspendCoroutine<Unit> {
//            continuation -> continuation.resume(Unit)
//    }

    // 4. Before, Suspended, (1초 후), After, Resumed 출력
//    suspendCoroutine<Unit> {
//            continuation ->
//            thread {
//                println("Suspended")
//                Thread.sleep(1000)
//                continuation.resume(Unit)
//                println("Resumed")
//            }
//    }

    // 5. Before, (1초 후), After
//    suspendCoroutine<Unit> {
//            continuation ->
//        thread {
//            println("Suspended")
//            Thread.sleep(1000)
//            continuation.resume(Unit)
//            println("Resumed")
//        }
//    }

    // 6. Before, (1초 후), After
    suspendCoroutine<Unit> {
        continuation -> continueAfterSecond(continuation)
    }

    log("After")
}

// 6. 정해진 시간 뒤에 코루틴을 다시 재개하는 함수
fun continueAfterSecond(continuation: Continuation<Unit>) {
    thread {
        Thread.sleep(1000)
        continuation.resume(Unit)
    }
}