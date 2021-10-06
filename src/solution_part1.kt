

fun main(){
    val customer =Customer("nora11",1212)
    val seller =Seller("moha3",89000)
    customer.signIn()
    seller.signIn()

}

interface UserProfile{
    val userName:String
    val password:Int

    fun signIn()
    fun editProfile()
}

abstract class SharedActions(){
    abstract var pageTitle :String
    abstract fun addComment()
    open fun rateTheWebsite(){}
}
class Customer(override val userName: String, override val password: Int):UserProfile,SharedActions(){

    override var pageTitle: String =""   //abstract variable
    //interface functions
    override fun signIn() =println("-- Welcome $userName, log in to the Costumer account ")
    override fun editProfile() =println("-- profile edited ")

    //abstract function
    override fun addComment() =println("comment added")

   //class function
    fun addItem(item:String) =println("$item added to the cart")
}

class Seller (override val userName: String, override val password: Int):UserProfile,SharedActions(){


    override var pageTitle: String =""  //abstract variable
    //interface functions
    override fun signIn() =println("-- Welcome $userName, log in to the Seller account ")
    override fun editProfile() =println("-- profile edited ")

    //abstract function
    override fun addComment() =println("comment added")

    //class function
    fun editProductList(){}
}

