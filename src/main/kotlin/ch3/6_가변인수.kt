package ch3

/**
 * listOf도 가변인수로 정의되있음
 */
fun vararg(args : Array<String>) {
    var list = listOf("args: ", *args)
    println(list)
}

fun args(vararg str : String) {
    for(s in str) {
        println(s)
    }
}

fun main() {
    var args = arrayOf("a", "b", "c")
    vararg(args);

    args("a", "b", "c", "d")
}