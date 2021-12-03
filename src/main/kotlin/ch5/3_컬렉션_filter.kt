package ch5

fun main() {
    val people = listOf(Person4("Alice", 29), Person4("Bob", 31))
    println(people.filter { it.age > 30 })      // filter는 원소 변환은 안됨
}