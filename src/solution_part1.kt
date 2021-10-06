import kotlin.math.abs

interface MathInterface{
    val firstNumber: Double
    val secondNumber: Double

    fun add(): Double
    fun difference(): Double
}

abstract class MathAbstractClass(open val num1: Double, open val num2: Double){
    fun mulitply():Double{
        return num1 * num2
    }
    abstract fun divide(): Double
}

class MathClass(override val num1: Double, override val num2: Double): MathInterface, MathAbstractClass(num1, num2) {
    override val firstNumber: Double = num1

    override val secondNumber: Double = num2

    override fun add(): Double {
        return firstNumber + secondNumber
    }

    override fun difference(): Double {
        return abs(firstNumber - secondNumber)
    }

    override fun divide(): Double {
        return firstNumber / secondNumber
    }
}
fun main(){
    val mathClass = MathClass(50.0, 6.5)
    println(mathClass.add())
    println(mathClass.difference())
    println(mathClass.mulitply())
    println(mathClass.divide())
}