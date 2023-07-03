package ch7

class Person3(
    val firstName: String, val lastName: String
) : Comparable<Person3> {

    override fun compareTo(other: Person3): Int {
        return compareValuesBy(this, other, Person3::lastName, Person3::firstName)  // compareValuesBy는 두 객체와 여러 비교 함수를 인자로 받는다.
    }

}

fun main() {
    val p1 = Person3("Alice", "Smith")
    val p2 = Person3("Bob", "Johnson")
    println(p1 < p2)
}