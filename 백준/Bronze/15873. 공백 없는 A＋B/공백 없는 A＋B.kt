fun main() {
    val input = readln()
    when (input.length) {
        2 -> {
            val a = input.first() - '0'
            val b = input.last() - '0'
            println(a + b)
        }
        3 -> {
            val first = input.first() - '0'
            if (first == 1 && input[1] == '0') {
                val b = input.last() - '0'
                println(10 + b)
            } else {
                println(first + 10)
            }
        }
        4 -> println(20)
    }
}
