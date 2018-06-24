package Fruit4

// We can ".copy()" Data Classes instances!

fun main(args: Array<String>) {
    val dataBasket1 = DataBasket(fruit = "Oranges", count = 2)
    println("dataBasket1: ${dataBasket1}") 

    val dataBasketCopy = dataBasket1.copy()
    println("dataBasketCopy: ${dataBasketCopy}") 
    
    println("dataBasket1.equals(dataBasketCopy): ${dataBasket1.equals(dataBasketCopy)}")
    // true

    val normalBasket1 = NormalBasket(fruit = "Lemons", count = 32)
    // No such method
    // val normalBasketCopy = normalBasket1.copy()
}

data class DataBasket(val fruit: String, val count: Int) {
    val name = "Data Basket"

    fun getCount() = println("count: ${count}")
}

class NormalBasket(val fruit: String, val count: Int) {
    fun getCount() = println("count: ${count}")

}