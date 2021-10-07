// I made abstract classes and Interfaces to solve both Questions of Part 1 in one Example
abstract class Cars {
    abstract val name: String
    abstract val type: String
    abstract val color: String
    abstract val price: Double
    abstract val maxSpeed: Int
    abstract val yearOfManufacture: Int
    abstract fun useAcceleration()
    abstract fun useBreak()
}

abstract class Hyundai : Cars()
abstract class Mazda : Cars()

interface MazdaFeatures2022 {
    val luxuryInteriorDesign: Boolean
    fun smartEngineStart()
}

interface MazdaFeatures2023 : MazdaFeatures2022 {
    override val luxuryInteriorDesign: Boolean
        get() = true
    val tirePressureMonitoringSystem: Boolean
        get() = false

    fun autoHoldBreak()
    fun viewMonitor360()
}

class CX9(
    override val name: String,
    override val type: String,
    override val color: String,
    override val price: Double,
    override val maxSpeed: Int,
    override val yearOfManufacture: Int,
    override val luxuryInteriorDesign: Boolean,
    override val tirePressureMonitoringSystem: Boolean,
) : Mazda(), MazdaFeatures2023 {
    override fun useAcceleration() = println("Implement Accelerate ")
    override fun useBreak() = println("Implement Break ")
    override fun autoHoldBreak() = println("Implement Auto Hold to put the car in P when you hold on brake")
    override fun viewMonitor360() = println("Implement 360 View Monitor that allow you to see 360 degree ")
    override fun smartEngineStart() = println("Implement Smart Start Engine with one click the car will start")
    override fun toString(): String =
        "Car Name = [$name] , Type = [$type] , Color = [$color] , Max Speed = [$maxSpeed] , " +
                "Year of Manufacture = [$yearOfManufacture] , Price [$price SR]"

}

fun main() {
    val car = CX9("CX9-00246", "4x4", "Red", 180_000.0, 240, 2023, true, true)
    println(car.toString())
}

