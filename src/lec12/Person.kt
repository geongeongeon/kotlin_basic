package lec12

class Person private constructor(var name: String, var age: Int) {

    // 코틀린에는 static이 없음
    companion object Factory { // 이름이 없을 경우 기본 값은 Companion
        // const는 컴파일 시에 변수가 할당됨
        private const val MIN_AGE = 1

        @JvmStatic // Companion Object 이름 없이 호출 가능
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }
    }

}