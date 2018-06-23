package Spice2

import kotlin.reflect.full.declaredMemberExtensionProperties
import kotlin.reflect.full.declaredMemberProperties

fun main(args: Array<String>) {
    val spices = listOf(
            Curry(),
            Curry()
    )

    for (spice in spices) {
        print(spice)
        println(spice.name)
        println(spice.heat)
    }

}

fun print(instance: Spice) {
    println("==============")
    readProps(instance)
}

fun readProps(instance: Spice) {
    // Will not print out properties on Spice
    // ie. name/spiciness/color
    val props = instance.javaClass.kotlin.declaredMemberExtensionProperties
    props.forEach {
        println("^^^^^^^^^^^^^^")
        println("it: $it")
        // this doesn't print anything atm
        println("${it.name.padEnd(13)} -> ${it}")
    }
}

// Spice is an abstract class with a constructor
abstract class Spice(
        val name: String,
        val spiciness: String = "mild",
        val color: SpiceColor = SpiceColorRed)
{
    val heat: Int
        get() {
            return when (spiciness) {
                "zero" -> 0
                "mild" -> 3
                "medium" -> 6
                "hot" -> 10
                else -> 5
            }
        }
}
// Curry is a concrete (non-abstract) subclass of Spice (:Spice)
// We can instantiate objects from Curry
// Curry (like its superclass Spice), also has a constructor
class Curry(
        name: String = "curry",
        spiciness: String = "medium",
        color: SpiceColor = SpiceColorYellow
): Spice(spiciness, name, color) {
}

// Spice Color is an Interface
// it is implemented by SpiceColorYellow and SpiceColorRed
interface SpiceColor {
    val color: String
}

object SpiceColorYellow : SpiceColor {
    override val color = "yellow"
}

object SpiceColorRed : SpiceColor {
    override val color = "red"
}


