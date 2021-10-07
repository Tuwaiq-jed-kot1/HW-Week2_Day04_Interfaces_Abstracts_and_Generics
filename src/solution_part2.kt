class Money<T>(var sal:T){
    fun printsal() {
        println("Salry: $sal")
    }
}

fun main() {
    var x=Money(1000)
    var y=Money(8000)
    x.printsal()
    y.printsal()
}