import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val sb = StringBuilder()
    val n = br.readLine().toInt()
    val cards = br.readLine().split(" ").map { it.toInt() }
    val m = br.readLine().toInt()
    val queries = br.readLine().split(" ").map { it.toInt() }
    
    val map = mutableMapOf<Int, Int>()
    for (card in cards) {
        map[card] = map.getOrDefault(card, 0) + 1
    }
    
    for (query in queries) {
        sb.append(map.getOrDefault(query, 0)).append(' ')
    }
    print(sb)
}