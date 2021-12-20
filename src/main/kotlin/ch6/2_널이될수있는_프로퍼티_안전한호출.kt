package ch6

class Employee(val name: String, val manager: Employee?)

// null이 될 수 있는 프로퍼티를 다루기 위한 안전한 호출
fun managerName(employee: Employee) : String? = employee.manager?.name

fun main() {
    val ceo = Employee("Da Boss", null)
    val developer = Employee("Bob Smith", ceo)
    println(managerName(developer))
    println(managerName(ceo))
}