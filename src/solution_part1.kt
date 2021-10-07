interface Sport{
    val playerName: String
    val score: Int
    val team: String
    fun teamPoint()
}

class Football(override val playerName: String, override val score: Int, override val team: String) : Sport{
    override fun teamPoint() {
    }
}

/////////////////////////////////////////////////////////////////////

abstract class Food{
    abstract val restaurantName:String
    open lateinit var restaurantLocation: String
    open fun restaurantRate(){

    }
    abstract fun restaurantStaffRate()
}

class Restaurant(override val restaurantName: String, override var restaurantLocation:String) : Food(){

    override fun restaurantStaffRate() {
    }

}
fun main() {
    val player = Football("Messi",3,"PSG")
    println(player.playerName)
    println(player.team)
    val restaurant= Restaurant("Albaik","Jeddah")
    println(restaurant.restaurantName)
    println(restaurant.restaurantLocation)
}
