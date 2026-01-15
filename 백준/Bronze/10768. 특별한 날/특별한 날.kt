import java.time.LocalDate

fun main() {
    val month = readln().toInt()
    val dayOfMonth = readln().toInt()
    val input = LocalDate.of(2015, month, dayOfMonth)
    val date = LocalDate.of(2015, 2, 18)
    if (input.equals(date)) {
        println("Special")
    } else if (input.isBefore(date)) {
        println("Before")
    } else {
        println("After")
    }
}