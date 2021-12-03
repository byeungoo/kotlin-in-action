package ch5

/**
 * groupBy
 */
fun main() {
    val people = listOf(Person4("Alice", 29), Person4("Bob", 31), Person4("Hoon", 29))
    // Map<Int, List<Person4>> 로 출력
    println(people.groupBy{it.age})
}