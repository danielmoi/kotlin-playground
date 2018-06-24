package Bird

fun main(args: Array<String>) {
    val normalBird1 = Swallow()
    val normalBird2 = Swallow()

    /*
    val uniqueBird = Phoenix()
    Error:(14, 22) Kotlin: Expression 'Phoenix' of type 'Phoenix' cannot be invoked as a function. The function 'invoke()' is not found
    */

    val uniqueBird = Phoenix
    println("uniqueBird: ${uniqueBird}") 
    
    val color1 = Colors.BLUE
    println("color1: ${color1}")
    // BLUE


    // Enums with values
    val blueBox = Box(color = PrimaryColor.BLUE)
    println("PrimaryColor.BLUE: ${PrimaryColor.BLUE}")
    // BLUE
    println("blueBox.color: ${blueBox.color}")
    // BLUE
    println("blueBox.color.value: ${blueBox.color.value}")
    // blue


    // Instantiate a subclass of Sealed Class SealedBird
    val peacock1 = Peacock()
    println("peacock1: ${peacock1}")
}


abstract class Bird(val name: String)

class Swallow: Bird(name = "Swallow")

// Our Singleton, Phoenix
object Phoenix: Bird(name = "Phoenix")




// Enums
enum class Colors {
    BLUE,
    RED,
    YELLOW
}

// As Kotlin Enum is an object of an Enum class, these could be initialized.
enum class PrimaryColor(val value: String) {
    RED("red"),
    BLUE("blue"),
    YELLOW("yellow")
}

class Box(val color: PrimaryColor)


sealed class SealedBird(val name: String)
class Peacock: SealedBird(name = "Peacock")
