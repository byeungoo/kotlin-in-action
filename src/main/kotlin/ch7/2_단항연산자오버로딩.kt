package ch7

import java.math.BigDecimal

/**
 * 오버로딩할 수 있는 단항 산술 연산자
 * +a -> unaryPlus, -a unaryMinus, !a -> not, ++a,a++ -> inc, --a,a-- -> dec
 */
operator fun Point.unaryMinus() : Point {
    return Point(-x, -y)
}

operator fun BigDecimal.inc() = this + BigDecimal.ONE   // 증가 연산자 정의

fun main() {
    val p = Point(10, 20)
    println(-p)
}