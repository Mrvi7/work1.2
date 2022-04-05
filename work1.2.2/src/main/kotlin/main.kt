const val likes = 61

fun main() {

    val cnt = when {
        likes == 0 -> "Нет \u2665"
        likes == 11 -> "Понравилось $likes людям"
        (likes - 1) % 10 == 0 -> "Понравилось $likes человеку"
        else -> "Понравилось $likes людям"
    }
    println(cnt)
}