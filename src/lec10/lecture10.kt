package lec10

fun main() {
    Derived(300)
}

open class Base(open val number: Int = 100) {

    init {
        println("Base Class")
        // 상위 클래스의 생성자, 초기화 블록에서 open 프로퍼티를 사용하면 에기치 못한 버그 발생
        println(number)
    }

}

open class Derived(override val number: Int) : Base(number) {

    init {
        println("Derived Class")
    }

}