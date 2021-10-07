class AmazonBox <T>(val box: T){
    fun printBox(){
        println(box)
    }
}
///////////////////////
interface Toyota{
    fun carToyotaName() : String
}
interface Nissan{
    fun carNissanaName(): String
}

class Car(): Toyota, Nissan{
    override fun carToyotaName() : String {
        println("Your car name is")
        return "Camry"
    }
    override fun carNissanaName() : String {
        println("Your car name is")
        return "Altima"
    }
}
class AllCars<T>(val carName: T) where T: Car, T: Toyota{
    fun printCars(){
        println(carName.carToyotaName())
        println(carName.carNissanaName())
    }
}

fun main() {
    val box1 = AmazonBox("Books")
    box1.printBox()
    val box2 = AmazonBox(5)
    box2.printBox()
    val box3 = AmazonBox(5.2)
    box3.printBox()
    //////////////
    val car = AllCars(Car())
    car.printCars()
}