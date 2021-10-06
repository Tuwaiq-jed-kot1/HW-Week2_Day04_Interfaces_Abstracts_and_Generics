//** Part I - Interfaces and Abstract Classes.

//1 Create an example of, a Class and an Interface,
// and allow to Implement the Interface methods and variables in the Class.

interface Interface1 {
    fun theWeather()
}
interface Interface2 {
    fun wDay()
}
class Condition : Interface1, Interface2 {
    override fun theWeather() {
        println("The Weather is clear and sunny ")
    }
    override fun wDay() {
        println(" on Sunday")
    }
}
fun main(args: Array<String>) {
    val Condition = Condition()
    Condition.theWeather()
    Condition.wDay()
}

//2 Create an example of, a Class and an Abstract Class, and Implement different methods,
// variables, and Abastract methods from the Abstract Class

abstract class Weather{
    abstract fun clear()
}
class TheWeather: Weather(){

    override fun clear(){
        println("TheWeather is clear and sunny ..")
    }
}
fun main(args: Array<String>) {
    val obj = TheWeather()
    obj.clear()}
