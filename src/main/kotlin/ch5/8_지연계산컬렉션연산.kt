package ch5

/**
 * filter, map 같은거를 사용하면 결과 컬렉션을 즉시 생성.
 * 컬렉션 함수를 연쇄하면 매 단계마다 계산 중간 결과를 새로운 컬렉션에 임시로 담는다.
 * 시퀀스를 사용하면 중간 임시 컬렉션을 사용하지 않고도 컬렉션 연산을 인쇄할 수 있다.
 * 원소가 많은 경우에 성능이 많이 좋아진다.
 */
fun main() {
    val people = listOf(Person4("Alice", 29), Person4("Bob", 31))
    val toList = people.asSequence()    // sequence가 stream과 같은 개념이라고 생각하면됨
        .map(Person4::name) //중간연산
        .filter { it.startsWith("A") }  //중간연산
        .toList()   //최종연산. 이 때 연기됐던 모든 계산이 수행된다.
    println(toList)
}