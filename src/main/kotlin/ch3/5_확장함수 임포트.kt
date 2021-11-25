package ch3

import ch3.lastChar
import ch3.lastChar as last

fun main() {
    println("kotlin".lastChar())
    println("kotlin".last())    // as로 import할 함수명도 수정 가능. 한 파일 안에서 다른 여러 패키지에속해있는 이름이 같은 함수를 가져와 사용해야하는 경우 사용 (충돌 방지)

}