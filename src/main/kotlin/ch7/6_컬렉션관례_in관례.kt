package ch7

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x until lowerRight.x && // 범위를 만들고 "x" 좌표가 그 범위 안에 있는지 검사한다.
            p.y in upperLeft.y until lowerRight.y   // "until" 함수를 사용해 열린 범위를 만든다.
}

fun main() {
    val rect = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(20, 30) in rect)  // a in c -> c.contains(a)
    println(Point(5,5) in rect)
}