package ch6

fun main() {
    var letters = Array<String>(26) { i -> ('a'+i).toString()}
    println(letters.joinToString(""))
}