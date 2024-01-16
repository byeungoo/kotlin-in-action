package ch2

class Rectangle(val height : Int, val width : Int) {

    /**
     * 메소드로 작성해도 성능상 차이는 없지만 클래스 특성을 정의하고 싶다면 프로퍼티로 정의
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