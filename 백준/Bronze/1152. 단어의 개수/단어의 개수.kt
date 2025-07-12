fun main() {
    val input = readLine()!!.trim()
    if (input.isEmpty()) {
        println(0)
    } else {
        println(input.split(" ").size)
    }
}