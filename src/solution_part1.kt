//partI
//Q1: Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
interface Furtneture {

    val chair: Int
    val sofa: Int
    fun welcome() {
        println("welcome to my home")
    }
    fun mood() : String


}

class House : Furtneture {

    override val chair: Int = 12
    override val sofa: Int = 4
    override fun mood() = "happy"

}

///______________________________________________________________________________________
//q2:Create an example of, a Class and an Abstract Class, and Implement different methods, variables, and Abastract methods from the Abstract Class


abstract class Gamer(name: String) {

    init {
        println("welcome our champion $name!")
    }
    abstract fun yearsOfExperience(exp: Int)


    fun favoriteGame(fav: String) {
        println("My favorite game is $fav.")
    }


}

class GamenN(name: String): Gamer(name) {

    override fun yearsOfExperience(exp: Int) {
        println(exp)
    }
}


fun main() {
    println("*q1 results using interface*\n")

    val saeedHome = House()

    saeedHome.welcome()
    println("saeed's home cheers count ${saeedHome.chair}, and sofa count ${saeedHome.sofa}")
    println(saeedHome.mood())

    println("---------------------------------------------------")
    println("q2 results using abstract\n")
    val badr = GamenN("Badr Fadul")
    badr.favoriteGame("modern warfare 2")
    badr.yearsOfExperience(17)
}

