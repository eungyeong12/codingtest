fun main() {
    println(readln().split("").filter { it.isNotBlank() }
        .map { it.toInt() }.sortedDescending().joinToString(""))
}