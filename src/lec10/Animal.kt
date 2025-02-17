package lec10

// 추상 프로퍼티가 아니면 상속받을 때 'open' 키워드를 꼭 붙어야 함
abstract class Animal(protected val species: String, protected open val legCount: Int) {

    abstract fun move()

}