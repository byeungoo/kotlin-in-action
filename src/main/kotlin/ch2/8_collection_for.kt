package ch2

fun fizzBuzz(i : Int) = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i "
}

fun fizzBuzzDown() {
    for(i in 100 downTo 1 step 2) { // 100 downTo 1 은 역방향 수열을 만들고, step 2는 증가 값의 절대값이 2로 바뀐다.
        println(i)
    }
}

fun main() {
    for (i in 1..100) {
        println(fizzBuzz(i))
    }

    fizzBuzzDown()

}