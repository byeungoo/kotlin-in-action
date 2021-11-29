package ch4

class DelegatingCollection<T> : Collection<T> {
    private val innerList = arrayListOf<T>()
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<T>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<T> {
        TODO("Not yet implemented")
    }
}

/**
 * 위의 코드를 구현을 다른 객체에 위임중이라고 명시할 수 있음
 * by 사용
 * 클래스를 상속해서 상위 클래스의 메소드 자체를 정의하는거보다 안전
 */
class DelegatingCollectionRefactoring<T> (
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList{}