const val amount = 19_000
const val minTax = 35
const val tax = 0.75

fun main() {
    val result = amount * tax / 100
    val result2 = amount * tax % 100

    val a = when {
        result.toInt() % 10 == 1 -> "рубль"
        result.toInt() % 100 in 5..20 -> "рублей"
        result.toInt() % 10 in 2..4 -> "рубля"
        else -> "рублей"
    }
    if (result < minTax) println("$minTax $a")
    else println("${result.toInt()} $a ${result2.toInt()} копеек")
}