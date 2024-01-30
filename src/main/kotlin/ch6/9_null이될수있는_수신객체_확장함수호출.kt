package ch6

fun verifyUserInput(input: String?) {
    if(input.isNullOrBlank()) { // null일 경우 true로 참이됨. 안전한 호출을 하지 않아도 된다.
        println("Please fill in the required fields")
    }
}

//fun String?.isNullOrBlank() : Boolean = this == null || this.isBlank()

fun  main() {
    var input = null
    verifyUserInput(input)
}
