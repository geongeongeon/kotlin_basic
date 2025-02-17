package lec11

// 코틀린에서는 public이 기본값이므로 생략 가능
public fun main() {
}

// 생성자에 다른 접근 제어자를 사용하려면 constructor를 붙여줘야 함
class Test private constructor()

class Car(internal val name: String, private var owner: String, _price: Int) {

    var price = _price
        private set

}