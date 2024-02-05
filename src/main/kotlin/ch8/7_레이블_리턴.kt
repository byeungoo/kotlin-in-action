package ch8

import ch6.Person

fun lookForAlice2(people: List<Person>) {
    people.forEach label@{
        if(it.name == "Alice") {
            println("Found!")
            return@label
        }
    }
    println("Alice might be somewhere") // 항상 이 줄 출력
}

fun main() {
    val peoples = listOf(Person(name = "Hoon", company = null), Person(name = "Alice", company = null), Person(name = "Hi", company = null))
    lookForAlice2(peoples)
}