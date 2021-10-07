interface sum {


    val x: Double


    val y: Int


    fun sum() {

        println("Here interface sum two number  ")
        println(x + y)
    }

}


interface sub {

    val x: Double

    val y: Int

    fun sub() {

        println("Here interface sub two number  ")
        println(x - y)
    }

}


class Sum_Sub(override val x: Double, override val y: Int) : sub, sum {


    fun clu() {
        super<sum>.sum()
        print("\n-----------------------\n")
        super<sub>.sub()
    }
}



//------------------------------------------abstract-----------------------------------------



abstract class UQU(name: String) {

    init {
        println("Welcome to UQU $name.")
    }

    fun student_info(name:String,id: Long,department:String) {
        println("Name: $name.")
        println("ID: $id.")
        println("Department: $department.")

    }

    abstract fun message(_message: String)
}

class Student(name: String): UQU(name) {

    override fun message(_message: String) {
        println(_message)
    }
}



fun main() {


    println("Please enter two numberto sum & sub")
    var num1 = readLine()?.toDouble()!!
    var num2 = readLine()?.toInt()!!

    if (num1 != null && num2 != null) { val x_y = Sum_Sub(num1, num2);x_y.clu() } else { println("Plese enter number!!!") }


    println("----------------------------------abstract-------------------------------------------")


    val student = Student("BASIL")

    student.message("Congratulations Graduation\n")



    student.student_info("Basil",6000011804,"CS",)

}






