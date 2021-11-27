package ch4

interface Clickable {

    fun click()

    fun showOff() = println("I'm clickable!")   // 디폴트 구현이 있는 메소드

}

interface Focusable {
    fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")
    fun showOff() = println("I'm focusable!")
}