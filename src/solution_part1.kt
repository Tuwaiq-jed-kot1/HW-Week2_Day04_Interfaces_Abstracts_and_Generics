//////////////////////partI/////////////////////////////
interface MyInterface {
    var int:Int

    fun A()
    fun B() {
        // optional body
    }
}
class Child(override var int: Int) : MyInterface {
    override fun A() {
        TODO("Not yet implemented")
    }

    override fun B() {
        // body
    }
}

////////////////////partII////////////////////////////


abstract class W {
    abstract var mu:Int
    fun music1(mp3:String){
       println("the music you ABCDEFG")

    }
    abstract fun Music(): String
}

// 2
class J(override var mu: Int) : W() {
    override fun Music() = "asdfghjk.mp3"
}
