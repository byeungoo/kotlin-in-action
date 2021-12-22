package ch6

/**
 * Collection은 읽기만 가능. 원소 추가나 제거가 없다.
 * MutableCollection은 데이터 수정이 가능하다.
 * 읽기 전용 컬렉션이라고해도 꼭 변경 불가능한 컬렉션일 필요는 없다. 어떤 컬렉션 인스턴스를 가리키는 수많은 참조 중 하나일 수 있다.
 * 같은 객체를 읽어오면서 변경하면 ConcurrentModificationException이 발생할 수 있다.
 */
fun<T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
    for(item in source) {
        target.add(item)    // 변경 가능한 target 컬렉션에 원소를 추가한다.
    }
}