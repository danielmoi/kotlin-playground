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

    // growl is on a Bear; not all Animals growl
    a1.growl()

    // hunt is on a Bear; not all Animals are Carnivores
    a1.hunt()
}


interface AnimalActions {
    fun eat()
    fun sleep()
}
interface CarnivoreActions {
    fun hunt()
}

// Animal "implements" the AnimalActions interface
abstract class Animal: AnimalActions {
    override fun eat() {
        println("Eating....")
    }
    override fun sleep() {
        println("Sleeping...")
    }
}

// Bear "implements" the CarnivoreActions interface
class Bear(val name: String): Animal(), CarnivoreActions {
    fun growl() {
        println("GRRRRR!!!!")
    }

    override fun hunt() {
        println("Hunting!!!")
    }

}