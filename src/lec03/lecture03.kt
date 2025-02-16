package lec03

fun main() {
    var number1: Int? = 3

    // to[타입] 형식의 메서드로 형변환
    var number2: Long = number1?.toLong() ?: 0L

    var person: Person = Person("person", 10)
    printAgeIfPerson1(person)
    printAgeIfPerson2(null)

    // 문자열에서 ${}를 통해 변수를 사용
    // 간단한 변수를 사용할 때에는 {} 생략 가능
    println("${person.name}의 나이는 ${person.age}살 입니다.")

    // """ """를 통해 여러 줄의 문자 입력 가능
    println(
        """
            ${person.name}의 나이는
            ${person.age}살 입니다.
        """.trimIndent()
    )

    val str: String = "ABC"

    println(str[0])
    println(str[1])
    println(str[2])
}

fun printAgeIfPerson1(obj: Any) {
    if (obj is Person) {
        // 자동으로 스마트 캐스트되므로 as Person 생략 가능
        val person = obj as Person

        println(person.age)
    }

    if (obj !is Person) {
        println("사람이 아닙니다.")
    }
}

// Unit : 자바의 void 역할, 자동으로 타입이 추론되므로 생략 가능
fun printAgeIfPerson2(obj: Any?): Unit {
    val person = obj as? Person

    println(person?.age ?: 100)
}