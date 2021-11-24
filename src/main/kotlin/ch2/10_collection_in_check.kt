package ch2

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'

fun main() {
    println(isLetter('a'))
    println(isLetter('1'))

    println(isNotDigit('a'))
    println(isNotDigit('1'))

    println("Kotlin" in "Java".."Scala")    // 사이의 모든 문자를 이터레이션할 수 는 없지만, in 연산자로 범위에 속하는지는 확인 가능
    println("Kotlin" !in "Java".."Scala")
}