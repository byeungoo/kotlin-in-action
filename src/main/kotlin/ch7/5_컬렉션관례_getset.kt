package ch7

import java.lang.IndexOutOfBoundsException

/**
 * get 관례 구현하기
 */
operator fun Point2.get(index: Int): Int {
    return when(index) {
        // 주어진 인덱스에 해당하는 좌표를 찾는다.
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

/**
 * 관례를 따르는 set 구현하기
 */
data class MutablePoint(var x: Int, var y: Int)
operator fun MutablePoint.set(index: Int, value: Int) {
    when(index) {
        0 -> x = value
        1 -> y = value
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }
}

fun main() {

    val p = Point2(10, 20)
    println(p[1])   // x[a, b] -> x.get(a,b)

    val p2 = MutablePoint(10, 20)
    p2[1] = 42
    println(p2)

}
