fun main() {
    val s = readln()
    val count = IntArray(26)
    s.forEach {
        count[it - 'a']++
    }
    println(count.joinToString(" "))
}
