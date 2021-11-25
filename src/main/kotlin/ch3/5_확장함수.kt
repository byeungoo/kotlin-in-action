package ch3

/**
 * 메소드를 다른 클래스에 추가할 수 있는 확장 함수
 * 확장 함수는 어떤 클래스의 멤버 메소드인 것처럼 호출할 수 있지만 그 클래스의 밖에 선언된 함수
 * 확장 함수가 정적 메소드와 같은 특징을 가지므로 하위 클래스에서 오버라이드할 수 없다.
 */
//fun String.lastChar() : Char = this.get(this.length - 1)        // String이 수신 객체 타입, this가 수신 객체
fun String.lastChar() : Char = get(length - 1)  // this 없이도 위와 똑같이 작성 가능

fun String.middleChar() : Char = this.get(this.length/2-1)

fun Collection<String>.join(
    separator : String = ", ",
    prefix : String = "",
    postfix: String = ""
) = joinToString(separator, prefix, postfix)

fun main() {
    println("Kotlin".lastChar())
    println("Kotlin".middleChar())
    println(listOf("one", "two", "eight").join())
}