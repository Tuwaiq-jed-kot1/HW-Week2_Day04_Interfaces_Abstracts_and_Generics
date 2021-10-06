class Student<T>(id: T) {
    var id: T = id
    init {
        this.id= id
        println(id)
    }
}

fun main(){
    var studentIdInt: Student<Int> = Student<Int>(89237)
    var ageIdString: Student<String> = Student<String>("7263821736")
}