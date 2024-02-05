package ch8

import ch6.Company
import ch6.Person

fun lookForAlice(people: List<Person>) {
    people.forEach{
        if(it.name == "Alice") {
            println("Found!")
            return
        }
    }
    println("Alice is not found")
}

fun main() {
    val peoples = listOf(Person(name = "Hoon", company = null), Person(name = "Alice", company = null), Person(name = "Hi", company = null))
    lookForAlice(peoples)
}