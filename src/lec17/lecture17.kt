package lec17

fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_500),
        Fruit("바나나", 2_500),
        Fruit("바나나", 3_000),
        Fruit("바나나", 3_500),
        Fruit("수박", 10_000)
    )

    // 람다 1
    val isApple1: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }

    // 람다 호출 1
    isApple1(fruits[0])
    // 람다 호출 2
    isApple1.invoke(fruits[0])

    // 람다 2
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    filterFruits(fruits, isApple1)
    filterFruits(fruits) { it.name == "사과" }
}

private fun filterFruits(fruits: List<Fruit>, filter: (Fruit) -> Boolean): List<Fruit> {
    val results = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            results.add(fruit)
        }
    }
    return results
}