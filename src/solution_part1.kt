//part I
interface SweetShop {
    var sweetName: String
    var price: Double

    fun takeOrder() {
        println("What's your order from Munch ?")
    }

    fun info() {
        println("You didn't order yet..")
    }

    fun tip()
}

abstract class AbsBakery() {
    abstract var sweetName: String
    abstract var price: Double
    abstract fun tip()
    open fun infoAbs() {
        println("Hello from abstract: Your order is preparing")
    }


}

class Bakery(var sweetName_: String, var price_: Double) : SweetShop, AbsBakery() {
    override var sweetName: String = ""
    override var price: Double = 0.0
    override fun info() {
        println("Hello from Class: Your order is $sweetName_ and you should pay $price_ S.R")
    }

    override fun tip() {
        println("You can add tip.")
    }
}

fun main() {
    val cupcake = Bakery("CupCake", 6.78)
    cupcake.takeOrder()
    cupcake.info()
    cupcake.infoAbs()
    cupcake.tip()
}
