package Fruit2

// Data Classes can still have methods

fun main(args: Array<String>) {
    val basket1 = NormalBasket(fruit = "Oranges", count = 2)
    println("basket1: ${basket1}")
    basket1.getCount()

    val basket2 = DataBasket(fruit = "Lemons", count = 10)
    println("basket2: ${basket2}")
    basket2.getCount()
}

data class DataBasket(val fruit: String, val count: Int) {
    val name = "Data Basket"

    fun getCount() = println("count: ${count}")
}

class NormalBasket(val fruit: String, val count: Int) {
    fun getCount() = println("count: ${count}")

}

/*
    basket1: Fruit2.NormalBasket@34340fab
    count: 2
    basket2: DataBasket(fruit=Lemons, count=10)
    count: 10
*/
