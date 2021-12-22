package ch6

import java.lang.IllegalStateException

/**
 * 이 함수는 결코 정삭적으로 끝나지 않는다.
 * fail같은거 만들어서 실패하면 예외를 던져서 현재 테스트를 실패시키거나함
 */
fun fail(message: String) : Nothing {
    throw IllegalStateException(message)
}

fun main() {
    fail("No address")
}