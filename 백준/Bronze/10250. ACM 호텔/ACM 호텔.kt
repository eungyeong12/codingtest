fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (h, w, n) = readLine()!!.split(" ").map { it.toInt() }
        val floor = (n - 1) % h + 1
        val room = (n - 1) / h + 1
        println("%d%02d".format(floor, room))
    }
}