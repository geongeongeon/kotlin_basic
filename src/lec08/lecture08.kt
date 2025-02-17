package lec08

fun main() {
    println("v1")
    repeat("Hello World", 3, true)

    println("v2")
    repeat("Hello World")

    println("v3")
    // 매개변수 이름을 통해 직접 지정 가능
    repeat("Hello World", userNewLine = false)

    printNameAndGender(name = "person", gender = "male")

    println("v1")
    printAll("A", "B", "C")

    println("v2")
    val array = arrayOf("A", "B", "C")
    printAll(*array)
}

// public 생략 가능
// 함수가 하나의 결괏값이라면 '{}' 대신 '=' 사용 가능
fun max(a: Int, b: Int) = if (a > b) a else b

// 매개변수에 기본 값 지정 가능
fun repeat(str: String, num: Int = 3, userNewLine: Boolean = true) {
    for (i in 1 .. num) {
        if (userNewLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

fun printNameAndGender(name: String, gender: String) {
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}