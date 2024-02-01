package ch8

import java.lang.StringBuilder

fun <T> Collection<T>.joinToString(
    separator: String = "",
    prefix: String = "",
    postfix: String = "",
    transform: ((T) -> String)?
) : String {
    val result = StringBuilder(prefix)
    for ( (index, element) in this.withIndex() ) {
        if(index > 0) result.append(separator)
        val str = transform?.invoke(element) // 안전 호출을 사용해 함수를 호출한다.
            ?: element.toString()
        result.append(str)
    }

    result.append(postfix)
    return result.toString()
}