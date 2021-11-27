package ch4

import java.io.Serializable

interface State : Serializable

interface View {
    fun getCurrentState () : State
    fun restoreState(state : State) {}
}

class Button2() : View {

    override fun getCurrentState(): State = ButtonState()

    override fun restoreState(state: State) {

    }

    class ButtonState : State { // 코틀린의 중첩 클래스에 아무런 변경자가 붙지 않으면 static class와 동일하다. 중첩 클래스 안에는 바깥쪽에 대한 참조가 없다.

    }

    inner class InnerButton {   // 내부 클래스는 바깥 클래스에 대한 참조가 있다.
        fun getOuterCurrentState() {
            this@Button2.getCurrentState()  // 외부 클래스의 함수 호출
        }
    }

}