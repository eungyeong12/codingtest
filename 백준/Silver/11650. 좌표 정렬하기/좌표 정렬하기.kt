import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))
    val n = br.readLine().toInt()
    val coords = Array(n) {
        val (x, y) = br.readLine().split(" ").map { it.toInt() }
        x to y
    }
    coords.sortWith(compareBy({ it.first }, { it.second }))
    for ((x, y) in coords) {
        bw.write("$x $y\n")
    }
    bw.flush()
}