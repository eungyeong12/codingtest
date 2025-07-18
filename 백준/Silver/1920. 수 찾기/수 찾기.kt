import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val a = br.readLine().split(" ").map { it.toInt() }.toSet()
    val m = br.readLine().toInt()
    val b = br.readLine().split(" ").map { it.toInt() }
    
    val sb = StringBuilder()
    for (num in b) {
        sb.appendLine(if (a.contains(num)) 1 else 0)
    }
    print(sb)
}