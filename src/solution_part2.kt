class Makeup<T>(private var makeup: T) where T : EyeMakeup, T : Mascara {
    val myMakeup: EyeMakeup = makeup

    fun printItem() {
        println(makeup.mascaras())
        println(makeup.shadows())
    }
}

class EyeMakeup() : Mascara, Shadows {
    override fun mascaras(): Int {
        print("The num of mascaras you have = ")
        return 2
    }

    override fun shadows(): Int {
        print("The num of you shadow palettes have = ")
        return 5
    }
}

interface Mascara {
    fun mascaras(): Int
}

interface Shadows {
    fun shadows(): Int
}

fun main() {
    val eyes = Makeup(EyeMakeup())
    eyes.printItem()

    //Extra
    val b: Pro<Sandwiches> = Pro<Burgers>()
    val s: Cun<Burgers> = Cun<Sandwiches>()

}
//part II.2

open class Sandwiches()
open class Burgers(): Sandwiches()
class Sliders() : Burgers()

class Pro<out T>(){ //consider as read only
    fun pro():T{
       TODO("This is pro class")
    }
}
class Cun<in T>(){
    fun cun(t:T){
        TODO("This is Cun class")
    }
}

