package ch6

fun strLenSafe(s: String?) : Int = if (s != null) s.length else 0
//fun strLenSafe(s: String?) : Int = s?.length ?: 0

fun main() {
    println(strLenSafe("123"))
}
