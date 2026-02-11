fun main() {
    repeat(3) {
        val map = readln().split(" ").map { it.toInt() }
            .groupingBy { it }.eachCount()
        val zero = map[0] ?: 0
        val one = map[1] ?: 0
        when {
            zero == 1 && one == 3 -> println("A")
            zero == 2 && one == 2 -> println("B")
            zero == 3 && one == 1 -> println("C")
            zero == 4 -> println("D")
            else -> println("E")
        }
    }
}

