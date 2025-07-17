import java.io.*

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val n = br.readLine().toInt()
    val members = Array(n) { idx ->
        val (age, name) = br.readLine().split(" ")
        Triple(age.toInt(), name, idx)
    }
    val sorted = members.sortedWith(compareBy({ it.first }, { it.third }))
    for ((age, name, _) in sorted) {
        println("$age $name")
    }
}