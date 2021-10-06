// PART II: Q1

class Person1<T>(private var member: T) {

    fun printInfo() = println(member)
}
fun main(){

    println("------PART II: Q1------")
    val name = Person1("Salem")
    name.printInfo()
    val age = Person1(2)
    age.printInfo()
    val weight = Person1(11.20)
    weight.printInfo()
}
