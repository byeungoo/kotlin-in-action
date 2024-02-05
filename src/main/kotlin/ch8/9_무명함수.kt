package ch8

import ch6.Person

fun lookForAlice4(people: List<Person>) {
    people.forEach( fun(person){
        if(person.name == "Alice") return
        println("${person.name} is not Alice")
    })
}

fun main() {
    val peoples = listOf(Person(name = "Hoon", company = null), Person(name = "Alice", company = null), Person(name = "Hi", company = null))
    lookForAlice4(peoples)
}