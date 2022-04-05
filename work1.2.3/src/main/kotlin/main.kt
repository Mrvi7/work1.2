const val itemPrice = 9_000
const val discount = 5
const val standartDiscount = 100
const val melomanCard = 1
var lastBuy = true
var meloman = false

const val standart = itemPrice - standartDiscount

const val discountGold = itemPrice - (itemPrice * discount) / 100

const val regularBuyer = discountGold - (discountGold * melomanCard) / 100

const val regularBuyer2 = standart - (standart * melomanCard) / 100

fun addDiscount2() {
    if (meloman)
        println("После применения $melomanCard % скидки - $regularBuyer2 \u20BD")
    else println("Постоянным покупателям $melomanCard % скидки")
}

fun addDiscount() {
    if (meloman)
        println("После применения $melomanCard % скидки - $regularBuyer \u20BD")
    else println("Постоянным покупателям $melomanCard % скидки")
}

fun main() {

    if (lastBuy && itemPrice in 1001..10_000) {
        println("Покупка составит $itemPrice \u20BD\n")
        println("После применения $standartDiscount \u20BD скидки - $standart \u20BD\n")
        addDiscount2()
    } else if (lastBuy && itemPrice > 10_000) {
        println("Покупка составит $itemPrice \u20BD\n")
        println("После применения $discount % скидки - $discountGold \u20BD\n")
        addDiscount()
    } else {
        println("Покупка составит $itemPrice \u20BD")
    }
}