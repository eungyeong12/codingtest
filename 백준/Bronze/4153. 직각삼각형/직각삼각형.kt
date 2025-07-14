fun main() {
    while(true) {
        val input = readln()!!.split(" ").map { it.toInt() }
        val (a, b, c) = input.sorted()
        if (a == 0 && b == 0 && c == 0) break
        
        if (a * a + b * b == c * c) {
            println("right")
        } else {
            println("wrong")
        }
    }
}