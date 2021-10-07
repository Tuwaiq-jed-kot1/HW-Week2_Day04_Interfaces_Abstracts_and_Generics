interface CB{
    fun adding(n1:Int,n2:Int)
    fun delet(m1:Int,m2:Int)
    fun devision(c1:Int,c2:Int)
}
class Calculation():CB{
    override fun adding(n1: Int, n2: Int) {
    }

    override fun delet(m1: Int, m2: Int) {
    }

    override fun devision(c1: Int, c2: Int) {
    }
}
fun main() {
   var x=Calculation()
    println(x.adding(5,5))
}
//part 2
abstract class Computer() {
    abstract fun operatingSystem(): String
}
class Windows():Computer(){
    override fun operatingSystem(): String {
        return "windows"
    }
}

fun main() {
    val x=Windows()
    println(x.operatingSystem())
}