fun main() {
    val change = 1000 - readln().toInt()
    println(change / 500 + change % 500 / 100 + change % 500 % 100 / 50
    + change % 500 % 100 % 50 / 10 + change % 500 % 100 % 50 % 10 / 5
    + change % 500 % 100 % 50 % 10 % 5)
}
