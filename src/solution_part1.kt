interface User {
    val name: String
    val id: Int

    fun info()
}

abstract class Admin {
    abstract val adminEmail: String
    abstract val adminPassword: String

    abstract fun login(email: String, password: String)

}

class StoreAdmin(override val name: String, override val id: Int) : Admin(), User {

    override var adminEmail: String = "banana@msn.com"
    override var adminPassword: String = "123123"

    override fun info() {
        println("This your account informations\nName : $name \nID : $id  \nEmail : $adminEmail \nPassword : $adminPassword")
    }

    override fun login(email: String, password: String) {
        println("You Logged In")
    }
}

fun main(){
    val basel = StoreAdmin("Basel" ,675656)
    basel.adminEmail = "basel@msn.com"
    basel.adminPassword = "123123"
    basel.info()
}