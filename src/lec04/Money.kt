package lec04

data class Money(private val amount: Long) : Comparable<Money> {
    fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }

    override fun compareTo(other: Money): Int {
        return amount.compareTo(other.amount)
    }
}