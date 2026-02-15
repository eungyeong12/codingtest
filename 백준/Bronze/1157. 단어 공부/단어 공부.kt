import java.util.Locale.getDefault

fun main() {
    val map = readln().uppercase(getDefault()).groupingBy { it }.eachCount()
    val sorted = map.keys.sortedByDescending { map[it] }
    if(map.size >= 2 && map[sorted[0]] == map[sorted[1]]) {
        println("?")
    } else {
        println(sorted[0])
    }
}