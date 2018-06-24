package Vehicle

fun main(args: Array<String>) {
   val car1 = Car(make = "Ford", color = Blue, stuntMove = Burnout)
    car1.start()
    car1.accelerate()
    car1.stuntMove.go()

    println("----------")

    val car2 = Car(make = "Holden", color = Red, stuntMove = Donut)
    car2.start()
    car2.accelerate()
    car2.stuntMove.go()
}

abstract class Vehicle(val wheels: Int) {
    // All Vehicles get the start function
    // It cannot be overridden
    fun start() {
        println("$make starting...")
    }
    // We don't give abstract class functions a body
    abstract fun accelerate()

    abstract val color: Color
    abstract val make: String

    abstract val stuntMove: StuntMove


}

class Car(override val make: String, override val color: Color, override val stuntMove: StuntMove): Vehicle(wheels = 2) {
    // Implementation
    override fun accelerate() {
        println("Accelerating!!!!!!")
    }
}

interface Color {
    val name: String
}
object Blue: Color {
    override val name = "blue"
}
object Red: Color {
    override val name = "red"
}


interface StuntMove {
    val name: String
    fun go()
}
// Singleton = Burnout is a class that implements StuntMove, but there is only
// "Burnout", so we enforce only being able to instantiate Burnout once
// Kotlin instantiates Burnout for us - we can use it as "Burnout", instead of
// `burnout = Burnout()`
object Burnout: StuntMove {
    override val name: String
        get() = "Burnout"
    override fun go() {
        println("Burnout!!!!!!!")
    }
}
object Donut: StuntMove {
    override val name: String
        get() = "Donut"
    override fun go() {
        println("DONUT!!!!!!!!!!!")
    }
}
