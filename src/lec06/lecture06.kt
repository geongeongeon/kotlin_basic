package lec06

fun main() {
    println("1부터 3까지 반복")
    for (i in 1..3) {
        println(i)
    }

    println("3부터 1까지 반복")
    // 위에서부터 아래로 반복할 경우 downTo를 사용
    for (i in 3 downTo 1) {
        println(i)
    }

    println("1부터 5까지 반복 - 2씩 증가")
    // 등차를 설정할 때에는 step을 사용
    for (i in 1..5 step 2) {
        println(i)
    }

    println("컬렉션 순회")
    val numbers = listOf(1L, 2L, 3L)
    // 타입 추론이 가능하므로 number의 타입 생략 가능
    for (number in numbers) {
        println(number)
    }

    println("while문으로 반복")
    var i = 1
    while (i <= 3) {
        println(i)
        i++
    }
}