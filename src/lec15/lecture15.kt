package lec15

fun main() {
    val array1: Array<Int> = arrayOf(100, 200)

    // 배열의 첫번째 인덱스부터 마지막 인덱스까지 탐색
    for (i in array1.indices) {
        println("[${i}] : ${array1[i]}")
    }

    // plus를 통해 엘리먼트 추가
    val array2 = array1.plus(300)

    // 인덱스와 벨류를 한번에 탐색
    for ((idx, value) in array2.withIndex()) {
        println("[${idx}] : ${value}")
    }

    val numbers1 = listOf(100, 200) // 불변 리스트
    val numbers2 = mutableListOf(100, 200) // 가변 리스트
    numbers2.add(300)
    // 비어있는 리스트를 만들 경우에는 타입을 명시
    val emptyList = emptyList<Int>()
    // printNumbers 메서드에서 매개변수로 Int 타입의 리스트를 받기 때문에 타입 추론 가능
    printNumbers(emptyList())

    println(numbers1.get(0))
    println(numbers1[0])

    for (number in numbers1) {
        println(number)
    }

    for ((idx, value) in numbers1.withIndex()) {
        println("[${idx}] : ${value}")
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "MONDAY")
    oldMap[2] = "TUESDAY"

    mapOf(1 to "MONDAY", 2 to "TUESDAY")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap[key])
    }

    for ((key, value) in oldMap.entries) {
        println(key)
        println(value)
    }
}

fun printNumbers(numbers: List<Int>) {
}