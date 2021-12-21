package ch6

fun<T> printHashCode(t: T) {    // 타입 파라미터 T를 클래스나 함수 안에서 타입 이름으로 사용하면 끝에 물음표가 없어도 널이될 수 있다.
    println(t?.hashCode())  // T의 타입은 Any? 로 추론된다.
}