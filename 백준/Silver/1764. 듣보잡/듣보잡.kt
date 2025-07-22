fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val unheard = HashSet<String>()
    val sb = StringBuilder()
    val unheardAndUnseen = mutableListOf<String>()
    repeat(n) {
        unheard.add(readLine())
    }
    repeat(m) {
        val name = readLine()
        if (name in unheard) {
            unheardAndUnseen.add(name)
        }
    }
    unheardAndUnseen.sort()
    sb.appendLine(unheardAndUnseen.size)
    unheardAndUnseen.forEach { sb.appendLine(it) }
    
    print(sb)
} 