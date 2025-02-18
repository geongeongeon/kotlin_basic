package lec16

fun main() {
    val str = "ABC"
    println(str.lastChar())

    val person = Person("A", "B", 10)
    println(person.nextYearAge())
}

private fun String.lastChar(): Char {
    return this[this.length - 1]
}

fun Person.nextYearAge(): Int {
    println("멤버 함수")

    return this.age + 1
}