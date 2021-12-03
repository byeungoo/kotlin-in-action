package ch5

fun printProblemCounts(response: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    response.forEach{   // 코틀린에서는 자바와 달리 람다 밖 함수에 있는 파이널이 아닌 변수에 접근할 수 있고, 그 변수를 변경할 수 있다. 람다가 포획한 변수라고 말함
        if (it.startsWith("4")) {
            clientErrors++;
        } else if (it.startsWith("5")) {
            serverErrors++
        }
    }

    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val response = listOf("200 OK", "418 I'm a teapot", "400 Internal Server Error")
    printProblemCounts(response)
}