fun main() {
    val list = listOf('a', 'e', 'i', 'o', 'u')
    val s = readln()
    println(s.count { it in list })
}
