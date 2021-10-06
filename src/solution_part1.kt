
class DiceGame() : Random , Random2() {

    init {
        print("Enter 1 to throw the dice :")
        val b = readLine()?.toInt()
        if (b == 1){
            println(" ${random1()} ")
        }
    }

    override fun random1(): Int {
        val r1 :Int
        return (1..7).random()

    }
    override fun random2(): Int {
        val r2 :Int
        return (1..7).random()
    }
}


interface Random {

    fun random1() :Int

}
abstract class Random2{

    open fun random2() :Int {
        return random2()
    }
}


fun main() {

    val d = DiceGame()
    print(d.random1())

}
