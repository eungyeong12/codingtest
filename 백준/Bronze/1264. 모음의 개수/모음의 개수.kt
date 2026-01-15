fun main() {
    val list = listOf('a', 'e', 'i', 'o', 'u')
    while (true) {
        val s = readln().lowercase()
        if (s == "#") return
        println(s.count { it in list})
    }
}
