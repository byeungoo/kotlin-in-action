package ch7

import java.time.LocalDate

/**
 * 날짜 범위에 대한 이터레이터 구현하기
 */
operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object : Iterator<LocalDate> {  // 이 객체는 LocalDate원소에 대한 Iterator 구현
        var current = start

        override fun hasNext() = current <= endInclusive    // compareTo 관례를 사용해 날짜를 비교

        override fun next() = current.apply { current = plusDays(1) }   // 현재 날짜를 저장한 다음에 날짜를 변경한다. 그 후 저장한 날짜를 반환한다.

    }

fun main() {
    val newYear = LocalDate.ofYearDay(2017, 1)
    val daysOff = newYear.minusDays(1)..newYear
    for (dayOff in daysOff) {
        println(dayOff)
    }
}