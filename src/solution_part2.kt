fun main() {

    val fruit1 = AllFruitBasket1(Orange(55.0))
    val fruit2 = AllFruitBasket1(Apple(44.0))

    val fruit3 = FruitBasket2(Orange(55.0))

    val fruitCitrus1 = CitrusBasket1(Orange(55.0))
    val fruitCitrus2 = CitrusBasket2(Orange(55.0))

}

//-----------------------------------------------Part II - Generics.----------------------------------------------------
class AllFruitBasket1<T : Fruit>(type: T) {
    init {
        when (type) {
            is Orange -> println(" Fruit type is Orange")
            is Apple -> println("Fruit type is Apple ")
            else -> println("New fruit ")
        }
    }


}

class FruitBasket2<T>(private val type: T) where T:Fruit ,T:Citrus{
    fun FruitType() {
        when (type) {
            is Orange -> println(" Fruit type is Orange")
            else -> println("New fruit ")
        }
    }


}

//--------------------(The idea of in and out) not clear yet :(
class CitrusBasket1<out T : Citrus>(private val type: T) {
    fun FruitType() {
        when (type) {
            is Orange -> println(" Fruit type is Orange")
            else -> println("New  Citrus")
        }
    }


}

class CitrusBasket2<in T : Citrus>(private val type: T) {
    fun FruitType() {
        when (type) {
            is Orange -> println(" Fruit type is Orange")
            else -> println("New  Citrus")
        }
    }
}