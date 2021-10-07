interface University {


    var studentName: String
    var subject: String

    fun interfaceinfo() {
        println("welcome to the university")
    }
    fun addSubject() {
        println("you added a subject")
    }
}

abstract class UniversityOfJeddah() {
    abstract var studentName: String
    abstract var subject: String


    open fun abstractinfo() {
        println("welcome to Jeddah university ")
    }


}

class Student( studentName:String, subject: String) : University, UniversityOfJeddah() {
    override var studentName: String = studentName
    override var subject: String = subject
    override fun abstractinfo() {
        println("Hello $studentName you are studying $subject ")
    }

}

fun main() {
    val student = Student("Bashayer", "English")
    student.addSubject()
    student.interfaceinfo()
    student.abstractinfo()
}