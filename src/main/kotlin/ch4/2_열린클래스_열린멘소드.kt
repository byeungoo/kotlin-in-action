package ch4

/**
 * 열린 클래스를 만들려면 앞에 'open'을 붙여줘야함
 */
open class RichButton : Clickable {
    fun disable() {}        // 파이널 함수
    open fun animate() {}   // 하위 클래스에서 오버라드이드 가능
    override fun click() {} // 상위 클래스에서 열려있는 메소드를 오버라이드함. 오버라이드한 메소드는 기본적으로 열려있음
}