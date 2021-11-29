package ch4

/**
 * 마치 동반 객체 안에서 fromJSON 함수를 정의한 것처럼 호출할 수 있다.
 */
fun Person3.Companion.fromJSON(json: String) : Person3 {    // 확장 함수 선언
    return Person3(json)
}