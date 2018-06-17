package Animal2

import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.reflect

fun main(args: Array<String>) {
    makeAnimal()
}

fun makeAnimal() {
    val a1 = Bear(name="Mogli")

    println("a1 hasCells: ${a1.hasCells}")
    println("a1.name: ${a1.name}")

    print(a1)

    readProperties(a1)
}

abstract class Animal {
    val hasCells: Boolean = true

    abstract  val label: String
}

data class Bear(val name: String): Animal() {
    override val label = "bear"

}

fun print(instance: Any) {
    val props = instance::class.memberProperties
    println(props)
    for (prop in props) {
        prop.isAccessible = true
        println("${prop.name.padEnd(13)} -> ${prop}")
        // println("${prop.name.padEnd(13)} -> ${prop.get(instance)}")
        // Error:(40, 52) Kotlin: Out-projected type 'KProperty1<out Any, Any?>' prohibits the use of 'public abstract fun get(receiver: T): R defined in kotlin.reflect.KProperty1'
    }
}

fun readProperties(instance: Any) {
    val klass = instance.javaClass.kotlin
    klass.declaredMemberProperties.forEach {
        println("${it.name.padEnd(13)} -> ${it.get(instance)}")
    }
}


/*
fun magicPrint(instance: Any) {
    val props = instance::class.declaredMemberProperties
    for (prop in props) {
        prop.isAccessible = true
        println("${prop.name.padEnd(13)} -> ${prop.get(instance)}")
    }
}
*/