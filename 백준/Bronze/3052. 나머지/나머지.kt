fun main() {
    val set = mutableSetOf<Int>()
    repeat(10) {
        val num = readLine()!!.toInt()
        set.add(num % 42)
    }
    println(set.size)
}