package ch6

fun main(args: Array<String>) {
    for(i in args.indices) {    // 배열의 인덱스 값의 범위에 대해 이터레이션하기 위해 array.indices 확장 함수를 사용한다.
        println("Argument $i is : ${args[i]}") // array[index]로 인덱스를 사용해 배열 원소에 접근한다.
    }
}