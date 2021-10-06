//Create an example of, a Class and an Interface, and allow to Implement the Interface
// methods and variables in the Class.

interface Animal {
    fun breath(): Boolean {
       return true
    }
    fun eat() {
       println("eat")
    }
}
class Cat : Animal {
    override fun eat () {
        println("chicken")
    }
}
//Create an example of, a Class and an Abstract Class, and Implement different methods, variables,
// and Abastract methods from the Abstract Class

open class Car {
    open fun run() {
        println("Car is running..")
    }
}
abstract class Honda : Car() {
    override abstract fun run()
}
class City: Honda(){
    override fun run() {
        println("Honda City is running..")
    }
}




fun main() {
    val cat = Cat()
    print(cat.eat())
    println(cat.breath())
    val car=Car()
    car.run()
    val city=City()
    city.run()

}