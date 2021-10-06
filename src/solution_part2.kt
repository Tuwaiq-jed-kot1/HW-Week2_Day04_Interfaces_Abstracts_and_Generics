
class OddListOfNum<T>(val list: List<T>) {

    fun oddNum(): List<T> {
        return list.filterIndexed { index, _ -> index % 2 == 1 }
    }
}

fun main() {
    val listOfInts = listOf(4, 9, 10, 9, 3, 45 , 6 , 12  )
    val result = OddListOfNum(listOfInts)
    print(result.oddNum())
}
