package ch4

// 동반 객체는 약간 정적메소드, 필드 정의를 대신한다.

/**
 * 동반 객체가 private 생성자를 호출하기 좋은 위치임
 * 팩토리 메소드 사용할 때 유용
 */
class User8 private constructor(val nickname: String) {  // 주 생성자를 비공개로 만듬

    companion object {  // 동반 객체 선언
        fun newSubscribingUser(email: String) = User(email.substringBefore('@'))
    }

}

/**
 * 동반 객체를 일반 객체처럼 사용
 */
class Person(val name: String) {
    companion object Loader {   // 동반 객체에 이름을 붙일 수 있음
        //fun fromJSON(jsonText: String): Person = ...
    }
}

/**
 * 동반 객체에서 인터페이스 구현
 */

interface JSONFactory<T> {
    fun fromJSON(jsonText: String) : T
}

class Person2(val name: String) {
    companion object : JSONFactory<Person2> {   // 인터페이스 구현
        override fun fromJSON(jsonText: String) : Person2 = Person2("jsonText")   // 구현은 아니고
    }
}



fun main() {
    val subscribingUser = User8.newSubscribingUser("test@test.com")
    println(subscribingUser.nickname)
}