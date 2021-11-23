package ch2

val question = "삶, 우주, 그리고 모든 것에 대한 궁극적인 질문"
val answer = 42
val answer2 : Int = 43

fun main() {
    println(question)
    println(answer)
    println(answer2)

    val num : Int   // 초기화 안할 경우 반드시 타입 명시
    num = 45
    println(num)

    val num2 = 43   // 변경 불가능. 기본 적으로는 val을 이용해서 변경 불가능한 값으로 만들고 꼭 필요하면 그 때 var로 만들기
    var num3 = 50   // 변경 가능

}