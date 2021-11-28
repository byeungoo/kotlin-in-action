package ch4

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode=$postalCode)"  // toString 메소드 재정의

    override fun equals(other: Any?): Boolean {  // equals 메소드 재정의
        if (other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int = name.hashCode() * 31 + postalCode    // 동일한 해시코드 값 반환
}

fun main() {
    val client1 = Client("hoon", 1541)
    println(client1)

    val client2 = Client("hoon", 1541)
    println(client1 == client2)
}