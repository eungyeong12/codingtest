fun main() {
    val t = readln().toInt()
    repeat(t) {
        val n = readln().toInt()
        val schools = List(n) {
            val (name, drink) = readln().split(" ")
            School(name, drink.toInt())
        }
        val sorted = schools.sortedByDescending { it.drink }
        println(sorted[0].name)
    }
}

data class School(val name: String, val drink: Int)