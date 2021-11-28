package ch4

class User7(val name: String) {
    var address : String = "unspecified"    // var로 선언해야함
        set(value: String) {
            println("""
               Address was changed for $name:
               "$field" -> "$value".""".trimIndent())   // 뒷받침하는 필드 값 읽기

            field = value   // 뒷받침하는 필드 값 변경
        }
}

fun main() {
    val user = User7("Alice")
    user.address = "Elsen 47, 8023 Muenchen"
}