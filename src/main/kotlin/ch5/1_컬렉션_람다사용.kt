package ch5

data class Person4(
    val name : String,
    val age: Int,
)

val sum = {x : Int, y :Int -> x+y}


fun main() {
    val people = listOf(Person4("Alice", 29))
    println(people.maxBy {it.age})  // it는 자동 생성된 파라미터 이름
    println(people.maxBy (Person4::age))    // 멤버 참조
    println(people.maxOf { it.age })
    println(people.maxBy({p:Person4 -> p.age})) // 파라미터 타입 명시
    println(people.maxBy({p -> p.age})) // 파라미터 타입 명시 없이 가능
    println(people.maxBy(){p:Person4 -> p.age}) // 람다가 맨 뒤에 있는 파라미터면 괄호 뒤에 람다를 쓸 수 있다.
    println(sum(1,5))
}