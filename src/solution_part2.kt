// Part 2 - first Question
class Gen <T> (){
    private val listOfObjects:MutableList<T> = mutableListOf()
    fun addToMuList(obj : T) {
        listOfObjects.add(obj)
    }
    fun printToString() {
        listOfObjects.forEach {
            println(it)
        }
    }
}
open class Human()
data class Student(val name: String, val age: Int, val gpa: Double) : Human()
data class Doctor(val name: String, val age: Int, val specialized: String) : Human()

fun main() {
    val s = Student("Khalid",24,4.5)
    val d = Doctor("Mohammed",36,"Heart Surgery")
    val g  = Gen<Human>()
    g.addToMuList(s)
    g.addToMuList(d)
    g.printToString()
    // ------------------------- optional -------------------------
    val p = Producer(Student("Ahmed",24,4.7))
    println(p.obj.toString())
    val co = Consumer(Doctor("Husam",36,"General Surgery"))
    println(co.toString())
}
class Producer<out T>(val obj: T) // sense we used keyword ( out ) var is not allowed , we can't modify data only read it
class Consumer<in T>(obj: T) //  sense we used keyword ( in ) var and val is not allowed , we can't store data only write it ... I don't understand in , out



