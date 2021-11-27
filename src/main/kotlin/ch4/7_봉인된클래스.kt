package ch4

/**
 * ch2 expr.kt 예제에서 Expr을 구현하는 클래스가 새로 생길 때 처리되지 않고, default 분기를 탈 수 있다. 이를 방어하기 위해서 sealed 사용
 */
sealed class Expr { // 기반 클래스를 sealed로 봉인
    class Num(val value: Int) : Expr()
    class Sum(val left : Expr, val right: Expr) : Expr()
}

fun eval(e: Expr) : Int =
    when (e) {
        is Expr.Num -> e.value
        is Expr.Sum -> eval(e.right) + eval(e.left)
    }