package ch7

/**
 * 산술 연산자를 오버로딩 할 수 있다. pluse 앞에 operator 키워드를 붙여야한다.
 * '+' -> plus , '-' -> minus, '/' -> div, '%' -> mod(1.1부터 rem), '*' -> times 이 오버로딩 가능하다.
 *
 */
data class Point(val x: Int, val y: Int) {
    operator fun plus(other: Point) : Point {   // plus라는 이름의 연산자 함수를 정의한다.
        return Point(x + other.x, y + other.y)  // 좌표를 성분별로  더한 새로운 점 반환
    }
}

/**
 * 확장함수로도 정의 가능
 */
operator fun Point.plus(other: Point) : Point {
    return Point(x + other.x, y + other.y)
}

/**
 * 두 피연산자 타입이 달라도 정의 가능
 */
operator fun Point.times(scale: Double) : Point {
    return Point(( x * scale ).toInt(), ( y * scale ).toInt())
}

/**
 * 결과 타입이 피연산자 타입과 다른 연산자 정의하기
 */
operator fun Char.times(count: Int): String {
    return toString().repeat(count)
}

fun main() {
   val p1 = Point(1,5)
   val p2 = Point(2,3)
   val p3 = p1 + p2
   println(p3)
   println('a'*3)
}