fun main() {
    val n = readln().toInt()
    val people = Array(n) {
        val (weight, height) = readln().split(" ").map { it.toInt() }
        weight to height // Pair(weight, height)
    }
    var ranks = Array(n) { 1 }
    
    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i != j) {
                if (people[j].first > people[i].first && people[j].second > people[i].second) {
                    ranks[i]++
                }
            }
        }
    }
    println(ranks.joinToString(" "))
}