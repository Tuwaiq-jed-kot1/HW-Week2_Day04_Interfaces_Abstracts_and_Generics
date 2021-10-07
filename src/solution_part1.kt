//---------------------------------------Part I - Interfaces and Abstract Classes.--------------------------------------

interface Fruit {
    val amountInGram: Double
    fun calories()
    fun fruitBenefits()
}

//----------------
abstract class Citrus {

    abstract fun amountOfVitaminC()

    fun citrusInfo() {
        println("Citrus is most commonly thought of as a good source of vitamin C.")
    }

}

//----------------
class Orange(override val amountInGram: Double) : Fruit, Citrus() {
    override fun calories() = println("Calories of $amountInGram grams of Orange:${amountInGram * 0.49} Kcal")

    override fun fruitBenefits() {
        println(
            "Health Benefits of Orange :\nImprove Hair and Skin Health." +
                    "\nSProtects your cells from damage."
        )

    }

    override fun amountOfVitaminC() {
        println("$amountInGram grams of orange contain ${0.53 * amountInGram} grams of vitamin C.")
    }

}

//----------------
class Apple(override val amountInGram: Double) : Fruit {
    override fun calories() = println("Calories of $amountInGram grams of apples :${amountInGram * 0.4905} Kcal")

    override fun fruitBenefits() {
        println(
            "Health Benefits of Apple :\nThe Antioxidants in Apples May Play a Role in Cancer Prevention." +
                    "\nHelp Prevent Alzheimer’s Disease."
        )
    }

}


//----------------------------------------------------------------------------------------------------------------------
fun main() {
    val fruitA = Apple(100.0)
    fruitA.fruitBenefits()
    fruitA.calories()

    println("--")

    val fruitO = Orange(100.0)
    fruitO.citrusInfo()
    fruitO.fruitBenefits()
    fruitO.calories()
    fruitO.amountOfVitaminC()

//-------------------------------

}