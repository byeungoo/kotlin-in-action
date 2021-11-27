package ch4

internal open class TalkativeButton : Focusable {
    private fun yell() = println("Hey!")
    protected fun whisper() = println("Let's talk!")
}

internal fun TalkativeButton.giveSpeech() {
    //yell()      // private 멤버라 접근 불가
    //whisper()   // protected 멤버라 접근 불가
}