package ch4

class LengthCounter {

    var counter: Int = 0
        private set // 이 클래스 밖에서 프로퍼티의 값을 바꿀 수 없다.

    fun addWord(word: String) {
        counter += word.length
    }

}

fun main() {
    val lengthCounter = LengthCounter()
    lengthCounter.addWord("hi hi hi")
    //lengthCounter.counter = 33
    println(lengthCounter.counter)
}