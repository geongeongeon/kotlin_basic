package lec02

fun main() {
    // null을 허용한 변수에서 null 확인을 안하고 값을 사용할 경우
    val str1: String? = "ABC"
    println(str1?.length)

    // null을 허용한 변수에서 null 확인을 안하고 사용할 때 결과가 null이 나왔을 경우에 특정 값으로 반환
    val str2: String? = "ABC"
    println(str2?.length ?: 0)

    val person = Person("person")
    println(person.name)
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("null 값이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// 해당 값이 절대 null이 될 수 없을 경우
fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithA5(str: String): Boolean {
    return str.startsWith("A")
}