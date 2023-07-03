package ch7

import java.time.LocalDate

/**
 * 범위를 만들려면 .. 구문을 사용해야 한다.
 * '..' 연산자는 rangeTo 함수 호출로 컴파일된다.
 * 어떤 클래스가 Comparable 인터페이스를 구현하면 rangeTo를 정의할 필요가 없다.
 * 코틀린 표준 라이브러리를 통해 비교 가능한 원소로 이루어진 범위를 쉽게 만들 수 있다.
 * Comparable 객체에 대해 적용 가능한 rangeTo 함수가 들어있다.
 */
fun main() {
    val now = LocalDate.now()
    val vacation = now..now.plusDays(10)
    println(now.plusWeeks(1) in vacation)
}