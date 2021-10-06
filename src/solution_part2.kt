//Part||
//Q1
class Age<T>(var age :T){
    fun printUserAge(){
        println("Your Age is $age")
    }
}
fun main(){
    val age=Age(10)
    val age1=Age("ten years old")
    age.printUserAge()
    age1.printUserAge()
}

