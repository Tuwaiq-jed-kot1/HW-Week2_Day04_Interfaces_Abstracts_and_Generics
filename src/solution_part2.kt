class SimpleListIterator<T> (){
    fun printList(listValue: List<T>){
        for (i in listValue.indices){
            println(listValue.get(i))
        }
    }
}

fun main(){
    val list = listOf("Car", "Plane", "Train", "Ship")
    val iterator: SimpleListIterator<String> = SimpleListIterator()

    iterator.printList(list)
}