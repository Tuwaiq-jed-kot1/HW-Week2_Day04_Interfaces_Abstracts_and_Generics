

interface Skills{
    var skill:String
    var skillLevel:String
    fun mySkills{
        println("my skill is $skill, and my level is $skillLevel" +
    }
}

class Person ( skill:String,skillLevel:String):Skills{
override var skill:String =""
override var skillLevel:String=0
override fun mySkills{
    println("my skill is $skill, and my level is $skillLevel"
}
}

abstract class JobTitle(str:String){
   abstract  var jobName: String
   abstract val emploeeName: String
    val emploeeAge: String=""

     fun printJob(){
       println("Hello, $emploeeAge, Your job title is $jobName")
    }
    abstract fun printAge ()

class Company(str:String): JobTitle(str){
    override var jobName: String =""
    override var emploeeName: String= ""

    override fun printAge (){
    }
