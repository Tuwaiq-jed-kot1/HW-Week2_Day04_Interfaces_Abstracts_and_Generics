//- Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
interface Animal {
    fun health(){
        println(" Health is great ")
    }
    fun feed() {
        println("feeding on")
    }
}
class Lion : Animal {
   override fun health(){
        println(" Health is great ")
    }
    override fun feed () {
        println(" lion eat : Meat ")
    }
}

class Horse : Animal {
    override fun health(){
        println(" Health is not Good ")
    }
    override fun feed () {
        println(" Horse eat : barley ")
    }
}
//- Create an example of, a Class and an Abstract Class, and Implement different methods,
// variables, and Abstract methods from the Abstract Class
open class Car {
    open fun speed () {
        println("Car is very fast ")
    }
    open fun color () {
        println("Car is white ")
    }
}
abstract class Toyota : Car() {
    abstract override fun speed ()
    override fun color () {
        println("Car is Black ")
    }
}
class Camry: Toyota(){
    override fun speed() {
        println("i love my Toyota Camry ")
    }
}
fun main() {

    val lion = Lion()
    lion.health()
    lion.feed()

    println() // Just for space

    val horse = Horse()
    horse.health()
    horse.feed()
    println() // Just for space

    val car=Car()
    car.color()
    car.speed()

    println() // Just for space

    val camry=Camry()
    camry.speed()

}


