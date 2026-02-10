fun main() {
    val map = List(3) {
        val (x, y) = readln().split(" ").map { it.toInt() }
        x to y
    }.groupBy({ it.first }, { it.second })

    val firstKey = map.keys.first()
    val firstKeyValues = map[firstKey]!!
    if (firstKeyValues.size == 2) {
        val x = map.keys.last()
        val y = firstKeyValues.first { it != map[x]!!.first() }
        println("$x $y")
    } else {
        val x = firstKey
        val lastKey = map.keys.last()
        val lastKeyValues = map[lastKey]!!
        val y = lastKeyValues.first { it != map[x]!!.first() }
        println("$x $y")
    }
}
