//part|
//Q1
class Person(private var name:String, override var gpa:Double):Student{
    override fun degree():String {
        if (gpa>=3.5){
            return "you are Excellent"
        }else if(gpa>=2.5){
            return "you are Very good"
        }else {return "you should increase your study hours"}
    }
    override fun printStudentInfo()=println("$name ${degree()}")
}
interface Student{
    var gpa:Double
    fun degree():String
    fun printStudentInfo()
}

//Q2
class Mathematic(var no1:Double,var no2:Double):Operation(no1,no2){
    override fun printResult(){
        println("$no1 + $no2 = ${mySum()}\n" +
                "$no1 - $no2 = ${mySub()}\n" +
                "$no1 * $no2 = ${myMul()}\n" +
                "$no1 / $no2 = ${myDiv()}\n")
    }
}
abstract class Operation(var num1:Double,var num2:Double){
    fun mySum():Double=num1+num2
    fun mySub():Double=num1-num2
    fun myMul():Double=num1*num2
    fun myDiv():Double=num1/num2
    abstract fun printResult()
}


fun main(){
    //Q1
    val person=Person("Sara",2.0)
    person.printStudentInfo()

    println("________________")

    //Q2
    val mathematic=Mathematic(10.0,4.0)
    mathematic.printResult()
}