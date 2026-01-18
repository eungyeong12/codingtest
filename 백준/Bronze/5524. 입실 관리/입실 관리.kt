import java.util.Locale.getDefault

fun main() {
    val n = readln().toInt()
    repeat(n) {
        println(readln().lowercase(getDefault()))
    }
}