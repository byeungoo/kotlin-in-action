package ch3

var opCount = 0 //프로퍼티 읽어 오기에서도 접근 가능
const val UNIX_LINE_SEPARATOR = "\n"    // public static final String UNIX_LINE_SEPARATOR = "\n"; 와 동일

fun performOperation() {
    opCount++
}

fun reportOperationCount() {
    println("Operation operformed $opCount times")
}

fun main() {
    performOperation()
    performOperation()
    reportOperationCount()
    println(UNIX_LINE_SEPARATOR)
}