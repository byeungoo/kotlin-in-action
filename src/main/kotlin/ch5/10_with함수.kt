package ch5

import java.lang.StringBuilder

/**
 * result에 대해 여러 메소드를 호출하면서 매번 result를 반복으로 사용한다.
 * 코드가 더 길어서 result가 많이 나올 때 복잡해질 수 있다.
 */
fun alphabet() : String {
    val result = StringBuilder()
    for(letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\nNow I know the alphabet!")
    return result.toString()
}

/**
 * with로 어떤 객체의 이름을 반복하지 않고도 그 객체에 대해 다양한 연산을 수행할 수 있다.
 */
fun alphabet2() : String {
    val stringBuilder = StringBuilder()

    // 첫번째 파라미터는 stringBuilder, 두번째 파라미터를 람다
    return with(stringBuilder) {    // 메소드를 호출하려는 수신 객체 지정
        for (letter in 'A'..'Z') {
            this.append(letter) // 지정한 수신 객체의 메소드 호출
        }
        append("\nNow I know the alphabet!")
        this.toString() // 람다에서 값을 반환
    }
}

fun alphabet3() = with(StringBuilder()) {
    for(letter in 'A'..'Z'){
        append(letter)
    }
    append("\nNow I know the alphabet!")
    toString()
}

fun main() {
    alphabet()
    alphabet2()
}