package ch4

import ch2.Person
import java.io.File

/**
 * 1. object 키워드로 싱글턴을 쉽게 구현 (객체 선언)
 */
object Payroll {
    val allEmployees = arrayListOf<Person>()
    fun calculateSalary() {

    }
}

fun main() {
    Payroll.allEmployees.add(Person("hoon", false))
    Payroll.calculateSalary()
}

/**
 * object 키워드로 Comparator 구현
 * Comparator 인스턴스를 만드는 방법으로 객체 선언이 가장 좋음
 */
object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File) : Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}