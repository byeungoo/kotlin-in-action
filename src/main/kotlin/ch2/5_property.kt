package ch2

class Rectangle(val height : Int, val width : Int) {

    /**
     * 클래스 트것ㅇ을 정의하고 싶다면 프로퍼티로 정의
     */
    val isSquare: Boolean
        get () {    // 커스텀 접근자
            return height == width
        }

    fun getArea() : Int {
        return height*width
    }
}

fun main() {
    val rectangle = Rectangle(10, 20)
    println(rectangle.isSquare)
    println(rectangle.getArea())
}