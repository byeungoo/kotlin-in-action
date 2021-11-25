package ch3

/**
 * listOf도 가변인수로 정의되있음
 */
fun varargs(args : Array<String>) {
    var list = listOf("args: ", *args)
    println(list)
}

fun main() {
    var args = arrayOf("a", "b", "c")
    varargs(args);
}