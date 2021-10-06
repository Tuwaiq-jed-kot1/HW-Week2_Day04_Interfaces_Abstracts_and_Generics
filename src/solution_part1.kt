//Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
//Create an example of, a Class and an Abstract Class, and Implement different methods, variables, and Abastract methods from the Abstract Class
//-----------------------------------------------Part1----------------------------------------//

interface FirstWaiter{
    val meal:String
        get() = "Rice & Chicken"
    fun order() = println("Message from the First Waiter")

}

interface SecondWaiter{
    val meal:String
        get() = "Kebab"
    fun order() = println("Message from the Second Waiter")

}
class Restaurant(bill: String, override val billCost: Double, override var billAddress: String)
    : FirstWaiter, SecondWaiter, Kitchen(bill){
    override val meal: String
        get() = super<FirstWaiter>.meal
    override fun order() {
        super<FirstWaiter>.order()
        super<SecondWaiter>.order()
    }
    override fun kitchenBilling(): String = "Your: $bill costs: $billCost SR"
}
abstract class Kitchen(var bill:String) {
    abstract val billAddress: String
    abstract val billCost: Double

    open fun kitchenBilling(): String = "Your: $bill costs: $billCost SR with taxes and will be sent to your: $billAddress"


}

fun main() {
    val food = Restaurant("Restaurant Bill",66.99,"Apartment")
    println(food.meal)
    food.order()
    println(food.kitchenBilling())


}