package ch2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException
import java.lang.StringBuilder

fun readNumber(reader: BufferedReader) : Int? { // 함수가 던질 수 있는 예외를 명시할 필요가 없다.
                                                // throw IOException을 던지지 않아도 된다.
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    } catch (e : NumberFormatException) {
        return null
    } finally {
        reader.close() // 체크 예외
    }

}

/**
 * try를 식으로 사용
 */
fun readNumber2(reader : BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e : NumberFormatException) {
        return  // 예외가 발생한 경우 catch 다음 블록 실행 안함
        //null    // 예외가 발생해도 catch 다음 블록 실행
    }

    println(number)
}

fun main() {
    val percentage = 50
    if(percentage !in 0..100) {
        throw IllegalArgumentException("a percentage value must be between 0 and 100: $percentage")
    }

    val number = 1
    val percentage2 =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException("a percentage value must be between 0 and 100: $number")

    val reader = BufferedReader(StringReader("not a number"))
    readNumber2(reader)
}