
## Part I - Interfaces and Abstract Classes.
---
- Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
- Create an example of, a Class and an Abstract Class, and Implement different methods, variables, and Abastract methods from the Abstract Class
 
 
  interface theFirstWaiter{
  val meal:String
  get() = "feno & Chicken"
  fun order() = println("Recet from the First Waiter")

}

interface theSecondWaiter{
val meal:String
get() = "Kebab & Kofta"
fun order() = println("Recet from the Second Waiter")

}
class Restaurant(bill: String, override val billCost: Double, override var billAddress: String)
: theFirstWaiter, theSecondWaiter, Kitchen(bill){
override val meal: String
get() = super<theFirstWaiter>.meal
override fun order() {
super<theFirstWaiter>.order()
super<theSecondWaiter>.order()
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

