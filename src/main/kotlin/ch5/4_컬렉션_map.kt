package ch5

fun main() {
    val numbers = listOf(1,2,3,4)
    println(numbers.map { it * it })      // map으로 원소 변환

    val people = listOf(Person4("Alice", 29), Person4("Bob", 31))
    println(people.map(Person4::name))
}