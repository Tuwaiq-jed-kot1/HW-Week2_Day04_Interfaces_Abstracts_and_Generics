//Create a Generic Class example with different type variances
//Create three Generic Classes examples, one with Where, one with Out keyword, and the third with In keyword
//-----------------------------------------------Part2-1----------------------------------------//
class Gacha<T>(private var wish :T) where T:Wishing,T:Characters{


    fun printWishes(){
        println(wish.rollChar())
        println(wish.rollWeapons())
    }

}
class Wishing(private var value :String):Characters {


    override fun rollChar():String{
        print("Your wished character is: ")
        return "Legendary 5 Star"
    }
    fun rollWeapons():String{
        print("Your wished weapon is: ")
        return "Epic 4 Star"
    }

}
interface Characters {
    fun rollChar():String
}


fun main() {
    val pity = Gacha(Wishing(value = "Common Item"))
    pity.printWishes()



}

//-----------------------------------------------Part2-2----------------------------------------//
// I could not complete this section due to me being frustrated with (in-out) Generic types :(

open class ItemsA(var a :String)
open class ItemsB(var b :String)

abstract class Legendary <out T>() : ItemsA(a = "*****"){
    fun outLegendary():T = TODO()
}
abstract class Epic <in T>() : ItemsB(b = "****"){
    fun inEpic(t:T): Nothing = TODO()
}