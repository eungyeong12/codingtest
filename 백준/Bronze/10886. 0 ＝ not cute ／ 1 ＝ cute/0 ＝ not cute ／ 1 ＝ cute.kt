fun main() {
    val n = readln().toInt()
    val map = List(n) { readln().toInt() }.groupingBy { it }.eachCount()
    val notCute = map[0] ?: 0
    val cute = map[1] ?: 0
    if (notCute > cute) {
        println("Junhee is not cute!")
    } else {
        println("Junhee is cute!")
    }
}