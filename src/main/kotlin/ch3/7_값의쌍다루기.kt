package ch3

fun main() {
    //구조 분해 선언
    val (number, name) = 1 to "one"
    print(number)
    print(name)
    println()
    val map = listOf(1 to "one", 2 to "two")
    println(map)
}