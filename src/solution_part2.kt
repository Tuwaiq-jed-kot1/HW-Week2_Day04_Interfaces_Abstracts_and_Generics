class AnyType<T>(var name: T,var id :T,var age:T,var alive:T){


}

fun <T> info(name:T,id: T,age: T,alive:T){
    println("ID: $id , name : $name , Age : $age , Alive : $alive \n")
}



//---------------------------------------2-----------------------------------------------

class Store<T>(private var commodity :T)where T:Collction, T:Shoz{

    val commodityObj :Collction= commodity

    fun printItem() {
        println(commodity.shirtFun())
        println(commodity.shozfun())
        println(commodity.jeansFun())
    }
}

class  Collction() : Shoz ,Jeans,Shirt{
    override fun shozfun(): Int { print("Shoz : ");return 12}
    override fun jeansFun():Int{ print("Jeans : ");return 19 }
    override fun shirtFun():Int{ print("Shirt : ");return 50 }
}
interface Shoz { fun shozfun():Int }
interface Shirt { fun shirtFun():Int }
interface Jeans { fun jeansFun():Int }


//----------------------------------OutClass--------------------------------



class OutClass<out T>(val value: T) {
    fun get(): T {
        return value
    }
}


//----------------------------------InClass--------------------------------
class InClass<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}

open class Gfather
class Father : Gfather()
class Son<in T>


fun main() {


    info("BASIL",6000011804,26,true)
    info("BASIL",56,"26","DEAD")





    println("-------------------------------------")

    val obj1 = Store(Collction())

    obj1.printItem()


    val out = OutClass("Hello")
    val ref: OutClass<Any> = out
    println(ref.value)


    val inClassObject: InClass<String> = InClass()

    var fmaily: Son<Father> = Son<Gfather>()


    val out2: OutClass<out Number> = OutClass<Int>(4) //Int is a subtype of Number


}

