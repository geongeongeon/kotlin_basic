package lec14

fun main() {
    val dto1 = PersonDto("person", 10)
    val dto2 = PersonDto("person", 20)

    println(dto1 == dto2)
    println(dto1)
}

// sealed class는 컴파일될 때 하위 클래스의 타입을 모두 기억함
sealed class HyundaiCar(val name: String, val price: Long)

class Avante : HyundaiCar("아반떼", 1_000L)
class Sonata : HyundaiCar("소나타", 2_000L)
class Grandeur : HyundaiCar("그렌저", 3_000L)