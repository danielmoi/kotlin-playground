package Fruit3


// We can do comparisons using ".equals" on Data Classes!!

fun main(args: Array<String>) {
    val normalBasket1 = NormalBasket(fruit = "Oranges", count = 2)
    println("normalBasket1: ${normalBasket1}")
    normalBasket1.getCount()

    val dataBasket1 = DataBasket(fruit = "Lemons", count = 10)
    println("dataBasket1: ${dataBasket1}")
    dataBasket1.getCount()

    val normaldataBasket1 = NormalBasket(fruit = "Oranges", count = 2)
    println("normaldataBasket1: ${normaldataBasket1}")
    normaldataBasket1.getCount()

    val dataBasket2 = DataBasket(fruit = "Lemons", count = 10)
    println("dataBasket2: ${dataBasket2}")
    dataBasket2.getCount()


    println("normalBasket1.equals(normaldataBasket1): ${normalBasket1.equals(normaldataBasket1)}")
    // false

    println("dataBasket1.equals(dataBasket2): ${dataBasket1.equals(dataBasket2)}")
    // true
}

data class DataBasket(val fruit: String, val count: Int) {
    val name = "Data Basket"

    fun getCount() = println("count: ${count}")
}

class NormalBasket(val fruit: String, val count: Int) {
    fun getCount() = println("count: ${count}")

}

