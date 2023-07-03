package coroutine

import kotlinx.coroutines.*

/**
 * 특정 코루틴을 실행할 때 사용할 스레드를 제어하는 작업을 담당하는 디스패치 컴포넌트를 제공한다.
 * 코루틴 문맥의 일부로 launch나 runBlocking 등의 코루틴 빌더 함수에서 이를 지정할 수 있다.
 * 디스패처는 그 자체로 원소가 하나뿐인 문맥이기도 하므로, 코루틴 빌더에 디스패처를 넘길 수 있다.
 */
fun main() {
    runBlocking {
        launch(Dispatchers.Default) {
            println(Thread.currentThread().name) // DefaultDispatcher-worker-1
        }
    }
}