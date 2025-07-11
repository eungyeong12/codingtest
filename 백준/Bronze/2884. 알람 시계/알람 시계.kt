fun main() {
    val (h, m) = readLine()!!.split(" ").map { it.toInt() }
    if (m >= 45) {
        println("$h ${m - 45}")
    } else {
        val nh = if (h == 0) 23 else h - 1
        val nm = m + 60 - 45
        println("$nh $nm")
    }
}