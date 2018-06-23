package Vehicle

fun main(args: Array<String>) {
   val car1 = Car(make = "audi", color = Blue, stuntMove = Burnout)
    println("car1.wheels: ${car1.wheels}") 
    println("car1.make: ${car1.make}")
    println("car1.color.name: ${car1.color.name}")
    car1.start()
    car1.accelerate()
    car1.stuntMove.go()
}

abstract class Vehicle(val wheels: Int) {
    // All Vehicles get the start function
    // It cannot be overridden
    fun start() {
        println("Starting...")
    }
    // We don't give abstract class functions a body
    abstract fun accelerate()

    abstract val color: Color

    abstract val stuntMove: StuntMove


}

class Car(val make: String, override val color: Color, override val stuntMove: StuntMove): Vehicle(wheels = 2) {
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
    fun go()
}
object Burnout: StuntMove {
    override fun go() {
        println("Burnout!!!!!!!")
    }
}
object Donut: StuntMove {
    override fun go() {
        println("DONUT!!!!!!!!!!!")
    }
}