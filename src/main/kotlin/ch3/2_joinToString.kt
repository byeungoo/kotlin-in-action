package ch3

fun<T> joinToString(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        if(index > 0 ) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

/**
 * 디폴트 파라미터 값
 */
fun<T> joinToString2(
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
): String {
    val result = StringBuilder(prefix)
    for((index, element) in collection.withIndex()) {
        if(index > 0 ) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun main() {
    val list = listOf(1,2,3)
    println(joinToString(list, "; ", "(", ")"))

    println(joinToString(list, separator = "; ", prefix = "(", postfix = ")")) // 코틀린에서는 함수에 전달하는 인자에서 이름을 명시할 수 있다. (가독성 향상)

    println(joinToString2(list))    // 디폴트 값 명시하면 파라미터에서 생략 가능능

}