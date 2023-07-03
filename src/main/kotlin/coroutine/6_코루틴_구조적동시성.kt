package coroutine

import kotlinx.coroutines.*
import java.lang.System

/**
 * 전역영역 코루틴(생명주기가 전체 애플리케이션의 생명주기에 의해서 제약되는 영역) 대신에 어떤 연산을 수행되는 동안만 실행되기를 원할 때 사용할 수 있다.
 * 자식 실행이 모두 끝나야 부모가 끝날 수 있도록 부모와 자식의 생명주기가 연관된다.
 * 이런 기능을 구조적 동시성이라고 부른다. 지역 변수 영역안에서 블럭이나 서브루틴을 사용하는 경우와 구조적 동시성을 비교할 수 있다.
 */
fun main() {
    runBlocking {
        println("Parent task started")

        launch {
            println("Task A started")
            delay(200)
            println("Task A finished")
        }

        launch {
            println("Task B started")
            delay(200)
            println("Task B finished")
        }

        delay(100)
        println("Parent task finished")
    }
    println("Shutting down...")
}