
class Building<T>(private var yurBuilding: T) {
    fun printNumBuilding() = println(yurBuilding)
}


class Apartment<T : Home>(private var apartment: T) {

    //fun printItems() = println(loot)
    val homeNum: Home = apartment
    fun printLoot(){
        println(homeNum.myHumNum())
    }
}

class Home(private var  homeNum: Int) {
    fun myHumNum():Int = homeNum
}



fun main() {
    val item1 = Building(2)
    item1.printNumBuilding()
    val item2 = Building("number 2")
    item2.printNumBuilding()
    val item3 = Building(2.0)
    item3.printNumBuilding()

    genericFun("125")
    genericFun(125)
    genericFun(125.0)

    val myHom = Apartment(Home(150))

    val y = Home(155)
    myHom.printLoot()
}

fun <T>genericFun(item : T) {
    println(item)
}

