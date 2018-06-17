package AnimalInterface

import Animal3.print

fun main(args: Array<String>) {
    makeAnimal()
}
fun makeAnimal() {
    val a1 = Bear(name = "Tom")

    print(a1)
    a1.sleep()
    a1.eat()
    a1.growl()
}


interface AnimalActions {
    fun eat()
    fun sleep()
}

abstract class Animal: AnimalActions {
    override fun eat() {
        println("Eating....")
    }
    override fun sleep() {
        println("Sleeping...")
    }
}

class Bear(val name: String): Animal() {
    fun growl() {
        println("GRRRRR!!!!")
    }

}