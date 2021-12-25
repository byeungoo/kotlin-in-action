package ch7

class Point2(val x: Int, val y: Int) {
    override fun equals(obj: Any?): Boolean {
        if (obj === this) return true
        if(obj !is Point2) return false
        return obj.x == x && obj.y == y
    }
}

fun main() {
    println(Point2(10, 20) == Point2(10, 20))
}