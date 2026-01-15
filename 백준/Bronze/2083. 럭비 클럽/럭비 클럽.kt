fun main() {
    while (true) {
        val input = readln()
        if (input == "# 0 0") return
        val tokens = input.split(" ")
        val name = tokens[0]
        val age = tokens[1].toInt()
        val weight = tokens[2].toInt()
        println("$name ${if (age > 17 || weight >= 80) "Senior" else "Junior"}")
    }
}