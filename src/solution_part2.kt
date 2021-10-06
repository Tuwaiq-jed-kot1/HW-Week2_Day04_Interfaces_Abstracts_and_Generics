//## Part II - Generics.
//Create a Generic Class example with different type variances
//Create three Generic Classes examples, one with Where, one with Out keyword, and the third with In keyword

class FirstGen<T>(private val obj: T) where T : MyClass1, T : FstInterface {
    fun useObj() = println((obj as MyClass1).numPlusTwo())
}

interface FstInterface {
    fun interfaceMethod()
}

class MyClass1(private var num: Int) : FstInterface {
    override fun interfaceMethod() = println("interface Method")
    fun numPlusTwo(): Int = num + 2
}

fun main() {
    val obj = FirstGen(MyClass1(5))
    obj.useObj()
}

//-----
abstract class SecondGen<out T> {
    abstract fun returnAGen(): T
}

class ImplementOut<T>(var obj: T) : SecondGen<T>() {
    override fun returnAGen(): T {
        return obj
    }
}

//-----
abstract class ThirdGen<in T> {
    abstract fun receiveAGen(gen: T)
}

class ImplementIn<T> : ThirdGen<T>() {
    override fun receiveAGen(gen: T) {
        println(gen.toString())
    }
}
//-----