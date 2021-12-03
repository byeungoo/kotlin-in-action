package ch5

/**
 * buildString 함수는 StringBuilder를 활용해 String을 만드는 경우 사용할 수 있음
 */
fun alphabet5() = buildString {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet5())
}