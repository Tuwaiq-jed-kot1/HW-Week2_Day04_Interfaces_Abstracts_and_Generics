// --->>>Create an example of, a Class and an Interface, and allow to Implement
// the Interface methods and variables in the Class.<<<---
interface InterA{
    val aint : Int
    fun callInterA(){
        println("i am InterA")
    }
}

class B:InterA {
    override val aint: Int = 1
    override fun callInterA() {
        println("i am fine")
    }
}

//  --->>>Create an example of, a Class and an Abstract Class, and Implement different
//  methods, variables, and Abastract methods from the Abstract Class<<<---
abstract class C{
    open var cint : Int = 7
    abstract val valCInt :Int
    fun cFun (){
        println("i am cFun")
    }
    abstract fun abCFun()
    open fun noFun (){}
}

class V : C(){
    override var cint: Int = 5
    override val valCInt: Int = 6
    override fun abCFun() {
        println("i am in class V")
    }
    override fun noFun() {
        println("i am in noFun")
    }
}

fun main() {
    //  --->>>print interface<<<---
    val p = B()
    println(p.aint)
    p.callInterA()
    println("------------------------------------")
    //  --->>>print abstract<<<---
    val q = V()
    println(q.cint)
    println(q.valCInt)
    q.abCFun()
    q.noFun()
}