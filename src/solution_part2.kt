//q1: Create a Generic Class example with different type variances
fun main() {
    var first = GenaricL<Int>(20)
    var second = GenaricL<String>("Vision")
    var third = GenaricL<Double>(30.0)
}
class GenaricL<T>(input:T) {
    init {
        println("the method invokes this time $input")
    }
}