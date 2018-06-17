package Animal1

fun main(args: Array<String>) {
    makeAnimal()
}


fun makeAnimal() {

    val animal1 = Bear()
    println("-----------------")
    println("animal1 planet: ${animal1.planet}")
    println("animal1 hasCells: ${animal1.hasCells}")
    println("animal1 color: ${animal1.color}")
    println("animal1 count: ${animal1.count}")

    var animal2 = SunBear()
    println("-----------------")
    println("animal2 planet: ${animal2.planet}")
    println("animal2 hasCells: ${animal2.hasCells}")
    println("animal2 color: ${animal2.color}")
    println("animal2 count: ${animal2.count}")
    animal2.planet = "pluto"
}

/*
// public final val "name"
abstract class Creature (val name: String){
    // public abstract val "name"
    abstract val name: Number
}
*/

abstract class Animal {
    // properties must be initialized or abstract

    val hasCells: Boolean = true
    var planet: String = "earth"

    // property with initializer cannot be abstract
    // abstract val color: String = "red"
    abstract val color: String
    abstract val animalType: String

    abstract var count: Int
    
}

// this animalType has a constructor, and thus must be initialized here
class Bear : Animal() {
    // "color" hides member of superType "Animal"
    // and needs "override" modifier
    override val color = "brown"

    override val animalType = "bear"
    override var count = 10
}

class SunBear : Animal() {
    override val color = "red"

    // "hasCells" in Animal is final and cannot be overridden
    // override val hasCells = false

    // Val-property cannot override var-property
    // override val planet = "sun"
    // override var planet = "sun"
    override var count = 1

    override var animalType = "sun bear"
}