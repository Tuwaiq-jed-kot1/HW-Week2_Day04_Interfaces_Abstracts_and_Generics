//      --->>>Create a Generic Class example with different type variances<<<---
//-------------------->>>>>>>>>>> Q1 <<<<<<<<<<<-------------------\\

class General<G>(var a : G){
    fun printName()= println(a)
    fun printAge()= println(a)
    fun printDegree()= println(a)
}

//-------------------->>>>>>>>>>> Q2 <<<<<<<<<<<-------------------\\
open class GrandFather
open class Father : GrandFather()
open class Son : Father()

//      --->>>in and out<<<---
class Pro<out G>{
    fun p(){
        println("out")
    }
}
class Cun<in G>{
    fun c(){
        println("in")
    }
}
class Both<G>{
    fun b(){
        println("both")
    }
}

//      --->>> where <<<---
class WWW<W>(var network :W)where W:Google{
    fun printsome(){
        println(network.myGoogleDraive())
        println(network.myOneDrive())
    }
}
class Google():GoogleDraive,OneDrive{
    override fun myGoogleDraive() = "Abdullah"
    override fun myOneDrive() = "Almohaimeed"

}
interface GoogleDraive{
    fun myGoogleDraive(): String
}
interface OneDrive{
    fun myOneDrive(): String
}

fun main() {
    println("----------------Generic-------------------")
    val name = General("Abdullah")
    val age = General(24)
    val degree = General(4.60)
    name.printName()
    age.printAge()
    degree.printDegree()
    println("----------------out--------------------")
    // in Pro we use out keyword and that means we can implement
    // just from the oldest to the youngest or from the same level.
    val test1 :Pro<GrandFather> = Pro<Father>()
    val test2 :Pro<GrandFather> = Pro<Son>()
    val test3 :Pro<Father> = Pro<Son>()
    val self1 :Pro<Father> = Pro<Father>()
    test1.p()
    test2.p()
    test3.p()
    self1.p()
    println("-----------------in-------------------")
    // in cun we use in keyword and that mean we can use implement
    // just from the youngest to the oldest or from the same level.
    val test4 :Cun<Son> = Cun<GrandFather>()
    val test5 :Cun<Son> = Cun<Father>()
    val test6 :Cun<Father> = Cun<GrandFather>()
    val test7 :Cun<Father> = Cun<Father>()
    test4.c()
    test5.c()
    test6.c()
    test7.c()
    println("-----------------where-------------------")
    val ww = WWW(Google())
    ww.printsome()

}
