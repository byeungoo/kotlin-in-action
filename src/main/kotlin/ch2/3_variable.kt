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

    // 문자열 템플릿안에 식이 들어갈 수 있음
    println("Hello, ${if(num2 > 0) num2 else "someone"}!")

    // 한글을 문자열 템플릿에서 사용할 때  유니 코드 변수 이름으로 인해 문자열 템플릿을 볼 때 오해가 생길 수 있다. ${} 로 사용하는 습관을 들이자.
    val name = "홍길동"
    println("Hello, $name 님 반가워요")
    println("Hello, ${name} 님 반가워요")
}