package ch2

import java.lang.IllegalArgumentException

interface Expr

class Num(val value : Int) : Expr       // Expr 인터페이스 구현
class Sum(val left : Expr, val right : Expr) : Expr

fun eval(e: Expr) : Int {
    if (e is Num) {         // 타입 검사 시 is 사용
        val n = e as Num    // 원하는 타입으로 명시적으로 캐스팅할 때는 "as" 키워드 사용
        return n.value
    }

    if (e is Sum) {
        return eval(e.right) + eval(e.left) // e가 Sum이라고 검사한 후부터는 e의 타입을 Sum으로 해석. 이를 스마트 캐스팅이라고한다.
    }

    throw IllegalArgumentException("Unknown expression")
}

/**
 * if문을 when으로 개선. if와 when중 어떤걸 사용할 때 더 좋은지 판단해보기
 */
fun refactEval(e: Expr) : Int = when(e) {
    is Num -> e.value
    is Sum -> refactEval(e.right) + refactEval(e.left)
    else -> throw IllegalArgumentException("Unknown expression")
}

/**
 * when에서 block 사용
 */
fun evalWithLogging(e : Expr) : Int = when(e) {
    is Num -> {
        println("num: ${e.value}")
        e.value     // 블록의 마지막 식이므로 e의 타입이 Num이면 e.value 반환
    }
    is Sum -> {
        val left = evalWithLogging(e.left)
        val right = evalWithLogging(e.right)
        println("sum : $left + $right")
        left + right
    }
    else -> throw IllegalArgumentException("Unknown expression")

}

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(refactEval(Sum(Sum(Num(1), Num(2)), Num(4))))
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}