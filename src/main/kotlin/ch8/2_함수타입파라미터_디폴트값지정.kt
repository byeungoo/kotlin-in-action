package ch8

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = "",
    prefix: String = "",
    postfix: String = "",
    transform: (T) -> String = {it.toString()} // 람다를 디폴트값으로 설정
): String {
    val result = StringBuilder(prefix)
    for ( (index, element) in this.withIndex() ) {
        if(index > 0) result.append(separator)
        result.append(transform(element)) // 파라미터로 받은 함수 호출
    }

    result.append(postfix)
    return result.toString()
}