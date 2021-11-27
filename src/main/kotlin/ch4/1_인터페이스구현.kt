package ch4


class Button : Clickable, Focusable {

    override fun click() = println("I was clicked")

    //override fun showOff() = println("I'm focusable!")  // 메소드 이름 같을 경우 에러가남. override해주면 default 사용안함
    override fun showOff() {
        super<Clickable>.showOff()  // 같은 이름의 메소드가 상위에 2개이상 있을 경우 상위 타입의 이름을 꺾쇠 괄호 사이에 넣어서 super를 지정하면 어떤 멤버 메소드 호출할지 지정 가능
        super<Focusable>.showOff()  // 둘다 넣으면 둘다 호출 된다.
    }
}

fun main() {
    val button = Button()
    button.click()
    button.setFocus(true)
    button.showOff()
}