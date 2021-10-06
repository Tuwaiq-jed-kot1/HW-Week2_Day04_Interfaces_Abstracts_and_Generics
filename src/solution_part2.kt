//Create a Generic Class example with different type variances
class CarName <T> (var carName :T){
    fun printCar(){
        println("Your car is $carName")
    }
}
fun main(){
    val carName=CarName("RangRover")
    val carId=CarName("ten")
    carName.printCar()
    carId.printCar()
}