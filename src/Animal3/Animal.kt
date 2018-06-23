package Animal3

import kotlin.reflect.full.declaredMemberProperties

fun main(args: Array<String>) {
    makeAnimal()
}

fun makeAnimal() {
    val bear1 = Bear(name = "Emma")
    print(bear1)

    bear1.feed()
    print(bear1)
}

fun print(instance: Any) {
    println("--------------")
    readProperties(instance)
}

fun readProperties(instance: Any) {
    // will not print out Animal.hasCells (Animal is the superclass of Bear)
    instance.javaClass.kotlin.declaredMemberProperties.forEach {
        println("${it.name.padEnd(13)} -> ${it.get(instance)}")
    }
}

abstract class Animal {
    val hasCells: Boolean = true

    abstract val label: String
    abstract var isHungry: Boolean

    abstract fun feed()
}

class Bear(val name: String): Animal() {
    override val label = "bear"

    override var isHungry = true

    override fun feed() {
        isHungry = false
    }
}