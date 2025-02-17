package lec12

fun main() {
    Person.Factory.newBaby("ABC")
    Person.newBaby("ABC")

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
}

// 싱글톤 클래스
object Singleton {
    var a: Int = 0
}