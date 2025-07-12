fun main() {
    val t = readLine()!!.toInt()
    repeat(t) {
        val (r, s) = readLine()!!.split(" ")
        println(s.map { it.toString().repeat(r.toInt())}.joinToString(""))
    }
}