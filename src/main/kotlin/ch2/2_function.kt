package ch2

fun max(a : Int, b : Int) : Int {   // 블록이 본문인 함수
    return if(a > b) a else b
}

fun max2(a : Int, b : Int) : Int =  if(a > b) a else b  // 식이 본문인 함수

fun max3(a : Int, b : Int) =  if(a > b) a else b    // 반환 타입 생략. 타입 추론 작동

fun main() {
    print(max(10,3))
}