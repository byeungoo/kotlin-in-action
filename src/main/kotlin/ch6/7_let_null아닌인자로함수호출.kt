package ch6

fun sendEmailTo(email: String) {
    println("Sending email to $email")
}

fun main() {
    var email: String? = "yole@example.com"
    email?.let { sendEmailTo(it) }

    email = null
    email?.let { sendEmailTo(it) }  // null일 경우는 함수를 호출하지 않는다. (아무일도 안일어남)
}