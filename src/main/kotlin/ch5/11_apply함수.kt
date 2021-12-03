package ch5

/**
 * apply는 with와 비슷한데 차이점은 수신 객체를 반환한다는 점이다.
 */
fun alphabet4() = StringBuilder().apply {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
}.toString()


fun main() {
    println(alphabet4())
}