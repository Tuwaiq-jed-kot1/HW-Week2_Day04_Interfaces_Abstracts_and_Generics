/*
## Part I - Interfaces and Abstract Classes.
Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
Create an example of, a Class and an Abstract Class, and Implement different methods, variables, and Abastract methods from the Abstract Class
*/
//## Part I - Interfaces and Abstract Classes.

//- Create an example of, a Class
// and allow to Implement the Interface methods
class Employee(eName: String, eAge: Int) : ElecEngineer {
    override var eName: String = "Ahmed"
    override var eAge: Int = 25
    override var eSalary = 150000.0
    override fun eDateOfBirth(date: String) {
        println("Date of birth is: $date")
    }
}
//and an Interface,
interface ElecEngineer {
    var eName: String
    var eAge: Int
    var eSalary: Double

    // and Implement different methods,
    //interface function
    fun eDateOfBirth(date:String)
    //non-interface function
    fun eEmployeeDetails() {
        println("Name of the employee: $eName.\nAge: $eAge.\nAnnual Salary: $eSalary SR.")
    }
}

//  and variables in the Class.


//- Create an example of, a Class and an Abstract Class,
// variables,
// derived class
class MechanicalEngineer(mName: String, mAge: Int) : MechanicalEmployee(mName, mAge) {
    // and Abastract methods from the Abstract Class
    override var mSalary = 144000.0
    override fun dateOfBirth(date: String) {
        println("Date of birth is: $date")
    }
}
abstract class MechanicalEmployee(val mName: String, val mAge: Int) {

    abstract var mSalary: Double

    // and Implement different methods,
    //Abstract method
    abstract fun dateOfBirth(date:String)
    //Non-Abstract Method
    fun mEmployeeDetails() {
        println("Name of the employee: $mName.\nAge: $mAge.\nAnnual Salary: $mSalary SR.")
    }
}
fun main() {

    // Abstract Part:
    println(" Abstract Part:")
    val mEng = MechanicalEngineer("Rashed", 27)
    mEng.mEmployeeDetails()
    mEng.dateOfBirth("23 January 1994")

    println("\n")

    //Interface Part:
    println(" Interface Part:")
    val eEngineer = Employee("Mohammed", 26)
    eEngineer.eEmployeeDetails()
    eEngineer.eDateOfBirth("17 October 1995")
}