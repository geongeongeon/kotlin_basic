package lec09

// constructor 생략 가능
// getter, setter 자동 생성됨
class Person constructor(val name: String, var age: Int) {

    fun getUppercaseName(): String {
        return this.name.uppercase()
    }

    val uppercaseName: String
        get() = this.name.uppercase()

    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }

        println("초기화 블록")
    }

    constructor(name: String): this(name, 1) {
        println("첫번째 생성자")
    }

    constructor(): this("person") {
        println("두번째 생성자")
    }

    // 방법 1
    fun isAdult(): Boolean {
        return this.age >= 20
    }

    // 방법 2
    val isAdult: Boolean
        get() = this.age >= 20
}