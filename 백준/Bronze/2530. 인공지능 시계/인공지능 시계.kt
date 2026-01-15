fun main() {
    val (a, b, c) = readln().split(" ").map { it.toInt() }
    val d = readln().toInt()
    val seconds = a * 3600 + b * 60 + c + d
    val hour = seconds / 3600 % 24
    val minute = seconds % 3600 / 60
    val second = seconds % 3600 % 60
    println("$hour $minute $second")
}
