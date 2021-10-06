//Part II - Generics.
//1 Create a Generic Class example with different type variances

class Weather<T>(c : T ){
    var cC=  c
    init {
        println(cC)
    }
}
fun main(args: Array<String>){
    var condition= Weather("The wteather is clear and sunny")
    var day = Weather(3)
}
