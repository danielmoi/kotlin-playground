package Fruit1

fun main(args: Array<String>) {
    val basket1 = NormalBasket(fruit = "Oranges", count = 2)
    println("basket1: ${basket1}")

    val basket2 = DataBasket(fruit = "Lemons", count = 10)
    println("basket2: ${basket2}")
}

data class DataBasket(val fruit: String, val count: Int) {
    val name = "Data Basket"
}

class NormalBasket(val fruit: String, val count: Int)

/*
    basket1: Fruit1.NormalBasket@34340fab
    basket2: DataBasket(fruit=Lemons, count=10)
 */