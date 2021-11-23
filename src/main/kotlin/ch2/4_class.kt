package ch2

class Person(
    val name : String,
    val isMarried: Boolean
)

fun main() {
    val person = Person("Bob", true)
    // 프로퍼티 이름을 직접 사용해도 코틀린이 자동으로 게터를 호출
    println(person.name)
    println(person.isMarried)
}