import java.time.DayOfWeek
import java.time.LocalDate

fun main() {
    val (month, dayOfMonth) = readln().split(" ").map { it.toInt() }
    val date = LocalDate.of(2007, month, dayOfMonth)
    println(when (date.dayOfWeek) {
        DayOfWeek.MONDAY -> "MON"
        DayOfWeek.TUESDAY -> "TUE"
        DayOfWeek.WEDNESDAY -> "WED"
        DayOfWeek.THURSDAY -> "THU"
        DayOfWeek.FRIDAY -> "FRI"
        DayOfWeek.SATURDAY -> "SAT"
        DayOfWeek.SUNDAY -> "SUN"
    })
}