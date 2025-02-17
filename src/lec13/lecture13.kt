package lec13

fun main() {
}

// 권장되는 클래스 안의 클래스
class House1(private val address: String, private val livingRoom: LivingRoom1) {

    class LivingRoom1(private val area: Double)

}

// 권장되지 않는 클래스 안의 클래스
class House2(private val address: String, private val livingRoom: LivingRoom2) {

    // 바깥 클래스를 참조하려면 클래스 앞에 inner 명시
    inner class LivingRoom2(private val area: Double) {
        // 바깥 클래스 참조를 위해 this@바깥 클래스 사용
        val address: String
            get() = this@House2.address
    }

}