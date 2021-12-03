package ch5

class Book(val title : String, val authors: List<String>)

fun main() {
    // flatMap은 감싸져 있는 Collection을 하나로 합치기 위한 연산
    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })    // toList로 해당 문자열에 속한 모든 문자로 이루어진 리스트 반환.
}