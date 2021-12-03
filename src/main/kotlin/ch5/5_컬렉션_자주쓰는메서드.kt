package ch5

val canBeInClub27 = {p: Person4 -> p.age <= 27}

fun main() {

    /**
     * any
     */
    val people = listOf(Person4("Alice", 29), Person4("Bob", 31))
    println(people.any())


    /**
     * all
     */
    // 모든 원소가 이 술어를 만족하는지 확인
    println(people.all(canBeInClub27))

    val list = listOf(1,2,3)
    println(!list.all{ it == 3})

    /**
     * count
     */
    println(people.count())

    /**
     * find : 술어를 만족하는 원소를 하나 찾고 싶으면 find 함수 사용
     */
    println(people.find(canBeInClub27))
}