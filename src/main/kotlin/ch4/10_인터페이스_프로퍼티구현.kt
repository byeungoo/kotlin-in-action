package ch4

interface User6 {
    val nickname: String    // 추상 프로퍼티 선언. 구현 클래스가 nickname을 얻을 수 있는 방법을 제공해야한다.
}

class PrivateUser(override val nickname: String) : User6

class SubscribingUser(val email: String) : User6 {
    override val nickname: String get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int) : User6 {

    override val nickname = getFacebookName(accountId)

    fun getFacebookName(accountId: Int) = "facebookUser@facebook.com"   // 그냥 테스트용으로 하드코딩

}

fun main() {
    println(PrivateUser("test@kotlin").nickname)
    println(SubscribingUser("test@kotlin").nickname)
    println(FacebookUser(2123).nickname)
}


