//## Part I - Interfaces and Abstract Classes.
//Create an example of, a Class and an Interface, and allow to Implement the Interface methods and variables in the Class.
//Create an example of, a Class and an Abstract Class, and Implement different methods,
// variables, and Abastract methods from the Abstract Class

interface MyInterface {
    val interfaceNum: Int
    fun interfaceFun()
    fun interfaceFunWithBody() = println("interface: I have a body no need to override")
}

abstract class MyAbstract {
    abstract val abstractNum: Int
    val abstractNumInitialize = 9
    lateinit var abstractStrLateInIt: String //we can have lateinit in abstract class
    abstract fun abstractFun()
    fun abstractFunWithBody() = println("abstract: I have a body no need to override")
}

class MyClass(override val interfaceNum: Int, override val abstractNum: Int) : MyAbstract(), MyInterface {
    override fun interfaceFun() = println("override interface fun")
    override fun abstractFun() = println("override abstract fun")
}


fun main() {
    val obj = MyClass(3, 7)
    obj.interfaceFun()
    obj.interfaceFunWithBody()
    obj.abstractFun()
    obj.abstractFunWithBody()
    println(obj.abstractNumInitialize)
    obj.abstractStrLateInIt = "lateinit variable"
    println(obj.abstractStrLateInIt)
}