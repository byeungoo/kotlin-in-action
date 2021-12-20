package ch6

import java.lang.IllegalArgumentException

/**
 * ?: (엘비스연산자) null 대신 사용할 디폴트 값 지정할 때 사용
 */
fun strLenSafe2(s: String?) : Int = s?.length ?: 0

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No Address")   // 엘비스 throw
    with (address) {
        println(streetAddress)
        println("$zipCode $city $country")
    }
}
