package ch6

fun ignoreNulls(s: String?) {
    val sNotNull: String = s!!  // 예외는 이 지점을 가리킨다.
    println(sNotNull)
}

fun main() {
    ignoreNulls(null)
}