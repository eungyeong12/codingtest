fun main() {
    val n = readln().toInt()
    var star = -1
    val stars = List(n) {
        star += 2
        star
    }
    stars.forEach {
        print(" ".repeat((stars.last() - it) / 2))
        println("*".repeat(it))
    }
    stars.reversed().drop(1).forEach {
        print(" ".repeat((stars.last() - it) / 2))
        println("*".repeat(it))
    }
}