package ch6

import java.io.BufferedReader
import java.lang.NumberFormatException

fun readNumbers(reader: BufferedReader) : List<Int?> {

    val result = ArrayList<Int?>()

    for(line in reader.lineSequence()) {
        try{
            val number = line.toInt()
            result.add(number)
        } catch (e: NumberFormatException) {
            result.add(null)
        }
    }

    val resultnNotNull = result.filterNotNull() // null 인거는 또 거를 수 있음

    return result
}