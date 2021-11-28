package ch4

/**
 * 클래스 이름 뒤에 오는 괄호로 둘러싸인 코드를 주 생성자라고 부른다.
 */
class User constructor(_nickname : String) {
    val nickname: String
    init {
        nickname = _nickname
    }
}

open class User2(_nickname: String) {
    val nickname = _nickname
}

class User3(val nickname: String)

class User4(val nickname: String, val isSubscribed: Boolean = true)

class User5(val superNickname : String) : User2(superNickname)  // 상위 클래스 생성자 호출

fun main() {
    val hoon = User4("hoon")    // isSubscribed는 기본값 사용
    val hoon2 = User4("hoon2", true)
    val hoon3 = User4(isSubscribed = false, nickname = "hoon2") // 파라미터 순서도 변경 가능
}