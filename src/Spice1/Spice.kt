package Spice1

import Animal3.print

fun main(args: Array<String>) {
    val spices = listOf(
            Curry(spiciness = "hot"),
            Curry(spiciness = "medium")
    )

    for (spice in spices) {
       print(spice)
    }

    val curry = Curry()
    print(curry)
}

abstract class Spice(val name: String, val spiciness: String = "mild", color: SpiceColor) {
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

interface SpiceColor {
    val color: String
}

object SpiceColorYellow : SpiceColor {
    override val color = "yellow"
}

object SpiceColorRed : SpiceColor {
    override val color = "red"
}


class Curry(spiciness: String = "medium", name: String = "curry") {
}
