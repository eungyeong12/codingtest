fun main() {
    val t = readln().toInt()
    val a = t / 300
    val b = t % 300 / 60
    val c = t % 300 % 60 / 10
    val remain = t % 300 % 60 % 10
    if (remain > 0) {
        println(-1)
    } else {
        println("$a $b $c")
    }
}