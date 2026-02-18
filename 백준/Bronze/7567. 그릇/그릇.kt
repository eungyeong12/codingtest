import kotlin.contracts.contract

fun main() {
    val list = readln().split("").filter { it.isNotBlank() }
    var height = 0
    list.forEachIndexed { index, plate ->
        if (index == 0) {
            height += 10
        } else {
            height += if (plate == list[index - 1]) 5 else 10
        }
    }
    println(height)
}