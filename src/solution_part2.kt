//- Create a Generic Class example with different type variances
class Gen<T>(access:T) {
    init {
        println("Your results are $access")
    }
}
fun main() {

    Gen (1)
    Gen ("Faisal")
    Gen (10.0)
}
