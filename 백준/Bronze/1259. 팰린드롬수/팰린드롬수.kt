fun main() {
    while (true) {
        val num = readln()
        if (num == "0") break
        if (num == num.reversed()) {
            println("yes")
        } else {
            println("no")
        }
    }
}