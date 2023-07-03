package coroutine

import kotlinx.coroutines.*
import java.io.File
import java.lang.Exception

/**
 * withTimeout : 작업이 완료되기를 무작정 기다릴 수 없어서 타임아웃을 설정해야할 경우 사용
 */
fun main() {
    runBlocking {
        val asyncData = async { File("/Users/byeonguhun/Desktop/data.txt").readText() }
        try {
            val text = withTimeout(10) {asyncData.await()} // 10ms안에 읽지 못하면 TimeoutCancellationException 발생
            println("Data loaded : $text")
        } catch (e: Exception) {
            println("Timeout exceeded")
        }
    }
}