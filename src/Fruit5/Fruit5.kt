package Fruit5

// Data Classes have nice decomposition (destructuring)

fun main(args: Array<String>) {
    val dataBasket1 = DataBasket(fruit = "Oranges", count = 2)
    println("dataBasket1: ${dataBasket1}")

    val (dbFruit, dbCount) = dataBasket1
    println("dbFruit: ${dbFruit}")
    println("dbCount: ${dbCount}")

    val normalBasket1 = NormalBasket(fruit = "Lemons", count = 32)
    println("normalBasket1: ${normalBasket1}")


    /*
    val (nbFruit, nbCount) = normalBasket1
    println("nbFruit: ${nbFruit}")
    println("nbCount: ${nbCount}")

    Error:(16, 30) Kotlin: Destructuring declaration initializer of type NormalBasket must have a 'component1()' function
     */
}

data class DataBasket(val fruit: String, val count: Int) {
    val name = "Data Basket"

    fun getCount() = println("count: ${count}")
}

class NormalBasket(val fruit: String, val count: Int) {
    fun getCount() = println("count: ${count}")

}