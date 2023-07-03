package coroutine

import kotlinx.coroutines.*
import java.lang.System

/**
 * runBlocking : 현재 스레드에서 실행되는 코루틴을 만들고 코루틴이 완료될 때까지 현재 스레드를 블럭시킨다.
 */
fun main() {

    GlobalScope.launch {
        delay(100)
        println("Background task: ${Thread.currentThread().name}") // DefaultDispatcher-worker-1 => 공유풀에서 백그라운드 스레드를 할당 받음.
    }

    // 블로킹 동작 때문에 다른 코루틴 안에서 사용하면 안된다. 블로킹 호출과 넌블로킹 호출 사이의 다리 역할을 하기 위해 고안된 빌더이므로
    // 테스트나 메인 함수에서 최상위 빌더로 사용하는 등의 경우에만 runBlocking()을 써야한다.
    runBlocking {
        println("Primary task: ${Thread.currentThread().name}") // main
        delay(200)
    }

}