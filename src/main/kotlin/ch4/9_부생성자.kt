package ch4

import javax.naming.Context
import javax.swing.text.AttributeSet

/**
 * 자바에서 오버로드한 생성자가 필요한 상황 중 상당수는 코틀린의 디폴트 파라미터 값과 이름 붙인 인자 문법을 사용해 해결할 수 있다.
 */
open class View2 {

    constructor(ctx: Context) { // 부 생성자

    }

    constructor(ctx: Context, attr: AttributeSet) { // 부 생성자

    }

}

class MyButton : View2 {

    constructor(ctx: Context) : super(ctx) { // 상위 클래스 생성자 호출

    }

    constructor(ctx: Context, attr: AttributeSet) : super(ctx, attr) { // 상위 클래스 생성자 호출

    }

}