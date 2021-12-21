package ch6

/**
 * 안전한 캐스트 : as?
 */
class Person2(val firstName : String, val lastName: String) {

    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person2 ?: return false  // 타입이 같지 않으면 false 반환
        return otherPerson.firstName == firstName && otherPerson.lastName == lastName   // 안전한 캐스트 후에는 otherPerson이 person 타입임
    }

    override fun hashCode() : Int = firstName.hashCode() * 37 + lastName.hashCode()

}