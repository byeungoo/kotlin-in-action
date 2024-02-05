package ch8

import ch5.Person4
fun main() {

    val peoples = listOf(Person4(name = "Hoon", age = 20), Person4(name = "Alice", age = 15), Person4(name = "Hi", age = 37))
    val result = peoples.filter(fun(person) = person.age < 30)
    println(result)
}