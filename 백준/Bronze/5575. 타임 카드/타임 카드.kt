import java.time.Duration
import java.time.LocalTime

fun main() {
    repeat(3) {
        val times = readln().split(" ").map { it.toInt() }
        val start = LocalTime.of(times[0], times[1], times[2])
        val end = LocalTime.of(times[3], times[4], times[5])
        val diff = Duration.between(start, end).seconds
        println("${diff / 3600} ${diff % 3600 / 60} ${diff % 3600 % 60}")
    }
}