package AnimalDelegate1

import Animal3.print

fun main(args: Array<String>) {
    makeAnimal()
}

fun makeAnimal() {
    val bear1 = Bear(name = "Emily")
    print(bear1)

    val bear2 = Bear(name = "Xander")
    print(bear2)

    val rhino1 = Rhino(name = "Tom")
    print(rhino1)

    val rhino2 = Rhino(name = "Beth")
    print(rhino2)

    val whale1 = Whale(name = "Wailmer")
    print(whale1)
}

interface AnimalColor {
    val color: String
}

// a Class, which only has ONE INSTANCE, and is instantiated as ColorBrown
object ColorBrown: AnimalColor {
    override val color: String = "brown"
}
object ColorGray: AnimalColor {
    override val color: String
        get() = "gray"
}

abstract class Animal: AnimalColor {
    val hasCells: Boolean = true

    abstract val animalType: String
}


// Bear implements the interface AnimalColor
// This implementation is done by delegation ("interface delegation")
class Bear(val name: String): Animal(), AnimalColor by ColorBrown {
    override val animalType = "bear"
}
class Rhino(val name: String): Animal(), AnimalColor by ColorGray {
    override val animalType = "rhino"
}

// Whale also implements the interface AnimalColor
// but DIRECTLY (not by interface delegation
class Whale(val name: String): Animal(), AnimalColor {
    override val animalType = "rhino"
    override val color = "blue"
}
