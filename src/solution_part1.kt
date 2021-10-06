// PART I: Q1
interface Animal{
    val str1: String
        get()= "Dog"
    fun test(){
        println("Hi from animal world!!")
    }
}
interface Human{
    val str2: String
        get()= "ahmad"
    fun test(){
        println("Hi from human world!")
    }
}
class TwoWorld : Animal, Human {
    override val str1: String = "Cat"

    override fun test() {
        super<Animal>.test()
        super<Human>.test()
    }
}

// PART I: Q2

abstract class Person(name: String) {

    init {
        println("My name is $name.")
    }

    fun showID(ID: Int) {
        println("My ID is $ID.")
    }

    abstract fun showJob(job: String)
}

class Employee(name: String): Person(name) {

    override fun showJob(job: String) {
        println(job)
    }
}

fun main (){
    println("------PART I: Q1------")
    val t = TwoWorld()
    t.test()
    println()
    println("------PART I: Q2------")
    val muhammad = Employee("Muhamad Salem")
    muhammad.showJob("I'm a Developer.")
    muhammad.showID(1605299)

}


