fun main() {
    val burgers = List(3) { readln() }.map { it.toInt() }
    val beverage = List(2) { readln() }.map { it.toInt() }
    println(burgers.min() + beverage.min() - 50)
}
