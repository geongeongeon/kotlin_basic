package lec04

fun main() {
    val money1: Money = Money(2_000L)
    val money2: Money = Money(1_000L)

    if (money1.compareTo(money2) > 0) {
        println("Money1이 Money2보다 금액이 큽니다.")
    }

    val money3 = money1
    val money4 = Money(2_000L)

    // 동등성 확인
    println(money1 == money3)
    println(money1 == money4)

    // 동일성 확인
    println(money1 === money3)
    println(money1 === money4)

    // fun1을 호출했을 때 결과가 true이므로 fun2는 호출하지 않음
    if (fun1() || fun2()) {
    }

    // fun2을 호출했을 때 결과가 false이므로 fun1는 호출하지 않음
    if (fun2() && fun1()) {
    }
}

fun fun1(): Boolean {
    println("fun 1")

    return true
}

fun fun2(): Boolean {
    println("fun 2")

    return false
}