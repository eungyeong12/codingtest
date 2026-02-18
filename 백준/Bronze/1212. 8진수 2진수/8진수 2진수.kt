import java.math.BigInteger

fun main() {
    val input = readln()
    val decimal = BigInteger(input, 8) // 8 -> 10진수
    val binary = decimal.toString(2) // 10 -> 2진수
    println(binary)
}