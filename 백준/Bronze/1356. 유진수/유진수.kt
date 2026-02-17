fun main() {
    val n = readln().toInt()
    if (n < 10) {
        println("NO")
        return
    }
    (1..n.toString().lastIndex).forEach {
        var first = 1
        var second = 1
        n.toString().substring(0, it).forEach { ch ->
            first *= ch - '0'
        }
        n.toString().substring(it).forEach { ch ->
            second *= ch - '0'
        }
        if (first == second) {
            println("YES")
            return
        }
    }
    println("NO")
}