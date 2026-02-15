fun main() {
    val n = readln().toInt()
    val map = List(n) { readln().first() }.groupingBy { it }.eachCount()
    val filtered = map.keys.filter { map[it]!! >= 5 }
    if (filtered.isEmpty()) println("PREDAJA")
    else println(filtered.sorted().joinToString(""))
}