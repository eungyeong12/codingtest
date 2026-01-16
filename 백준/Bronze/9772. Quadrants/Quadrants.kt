fun main() {
    while (true) {
        val (x, y) = readln().split(" ")
            .filter { it.isNotBlank() }.map { it.toDouble() }
        when {
            x == 0.0 && y == 0.0 -> {
                println("AXIS")
                return
            }
            x > 0 && y > 0 -> println("Q1")
            x < 0 && y > 0 -> println("Q2")
            x < 0 && y < 0 -> println("Q3")
            x > 0 && y < 0 -> println("Q4")
            else -> println("AXIS")
        }
    }
}