class NotePage <T> (private val note:T) {
    fun printNote() =println(" NOTE: $note.")}


class genWhere <T> (private val obj:T) where T:Calcu{

    fun printCalcu(){
        println("Multiplication : ${obj.printMultiplication()}" )
        println("Sum : ${obj.printSum()}")
    }

}
class Calcu(var num1:Int,var num2:Int):Sum,Multiplication{

    override fun printMultiplication()= num1*num2
    override fun printSum() =num1+num2
}
interface Sum {
 fun printSum():Int
}
interface Multiplication {
    fun printMultiplication() :Int
}

fun main(){
    //part 1
    val note =NotePage("writing ...")
    note.printNote()
    val note2 =NotePage(1.0)
    note2.printNote()
    //use where
    val obj =genWhere(Calcu(1,2))
    obj.printCalcu()

}