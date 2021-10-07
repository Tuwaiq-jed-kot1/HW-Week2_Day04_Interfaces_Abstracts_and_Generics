

interface COUNTRY {

    fun travel():String
    fun work():String
    fun study():String
}



abstract  class Island{
abstract fun swim(name :String ):String
fun Diving( name2:String){
println(" the diving in $name2 is great ")}
}





class Asia ():Island() ,COUNTRY{

    override fun travel(): String {
        return "great country "
    }

     override fun work(): String {
         return "great job "
     }

     override fun study(): String {
         return "great study "
     }


       /////////////

       override fun swim(name :String ): String {
           return "the swim  in $name is good "
       }
}


fun main (){
val SaudiArabia = Asia()

    println(SaudiArabia.work())
    println(SaudiArabia.travel())
    println(SaudiArabia.study())
    println(SaudiArabia.Diving("Maldives"))
    println(SaudiArabia.swim("bali"))

