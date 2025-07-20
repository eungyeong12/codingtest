import java.io.*

fun main() {
    val (n, k) = readln().split(" ").map { it.toInt() }
    val people = ArrayDeque<Int>((1..n).toList())
    val sb = StringBuilder()
    sb.append('<')
    while (people.isNotEmpty()) {
        for (i in 1 until k) {
            people.addLast(people.removeFirst())
        }
        sb.append(people.removeFirst())
        if (people.isNotEmpty()) sb.append(", ")
    }
    sb.append('>')
    print(sb)
}