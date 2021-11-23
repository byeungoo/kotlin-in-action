package ch2

import java.lang.Exception

enum class Color(
    val r : Int , val g : Int, val b : Int
) {
    RED(255, 0 , 0), ORANGE(255,166, 0),
    YELLOW(255,255,0), BLUE(0,0,255);

    fun rgb() = (r * 256 + g) * 256 + b // enum 안에 메소드 정의

}

fun getMnemonic(color : Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.BLUE -> "Battle"
    }

fun getWarmth(color : Color) = when(color) {
    Color.RED, Color.ORANGE, -> "warm"
    Color.YELLOW -> "neutral"
    Color.BLUE -> "cold"
}

/**
 * when과 임의의 객체 함께 사용
 */
fun mix(c1: Color, c2 : Color) = when(setOf(c1,c2)) {
    setOf(Color.RED,Color.YELLOW) -> Color.ORANGE       // Set 객체로 만드는 setOf 함수
    setOf(Color.BLUE, Color.RED) -> Color.YELLOW
    else -> throw Exception("Dirty color")
}

fun main() {
    val color = Color.RED
    println(color.rgb())
    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.YELLOW))
    println(mix(Color.RED, Color.YELLOW))
    println(mix(Color.YELLOW, Color.RED))   // 순서 바꿔도 동일
}