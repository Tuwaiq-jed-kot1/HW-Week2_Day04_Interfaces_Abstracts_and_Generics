/*
## Part II - Generics.
Create a Generic Class example with different type variances



## Part II - Generics.
Create a Generic Class example with different type variances
Create three Generic Classes examples, one with Where, one with Out keyword, and the third with In keyword*/

class MysteryBox<T>(private var loot: T) where T : Collction, T : Clothes {
    //casting
    val moneyObj: Collction = loot
    fun printItem() {
        println(loot.numberOfShoes())
        println(loot.numberOfPerfumesBottles())
    }
}
class Collction() : Clothes, Perfumes {
    override fun numberOfShoes(): Int {
        print("Number of shoes: ")
        return 5
    }
    override fun numberOfPerfumesBottles(): Int {
        print("\n Number of perfumes: ")
        return 3
    }
}
interface Clothes {
    fun numberOfShoes(): Int
}
interface Perfumes {
    fun numberOfPerfumesBottles(): Int
}
interface Pins {
    fun myPins(): Int
}
fun main() {
    val obj1 = MysteryBox(Collction())
    obj1.printItem()
}

/*
Create three Generic Classes examples, one with Where, one with Out keyword, and the third with In keyword
*/

// ran out of time