package coroutine

import kotlinx.coroutines.*
import java.lang.System

private fun CoroutineScope.showName() {
    println("Current coroutine : ${coroutineContext[CoroutineName]?.name}")
}
// 문맥을 합쳐줌
fun main() {
    runBlocking {
        showName() // Current  coroutine : null
        launch(coroutineContext + CoroutineName("Worker")) {
            showName() // Current coroutine: Worker
        }
    }
}