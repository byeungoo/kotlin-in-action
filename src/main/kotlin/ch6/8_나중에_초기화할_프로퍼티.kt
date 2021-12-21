package ch6

class MyService {
    fun performAction(): String = "foo"
}

class MyTest {

    private var myService: MyService? = null

    fun setUp() {
        myService = MyService()
    }

    fun testAction() {
        myService?.performAction() ?: "null"  // 반드시 널 가능성에 신경을 써야한다.
        myService!!.performAction() // 반드시 널 가능성에 신경을 써야한다.
    }

}