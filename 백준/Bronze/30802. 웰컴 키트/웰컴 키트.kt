fun main() {
    val n = readln()!!.toInt()
    val shirtCounts = readln()!!.split(" ").map { it.toLong() }
    val (t, p) = readln()!!.split(" ").map { it.toLong() }
    
    // 티셔츠 묶음 수
    var shirtBundles = 0L
    for (count in shirtCounts) {
        shirtBundles += (count + t - 1) / t
    }
    println(shirtBundles)
    
    // 펜 묶음 수, 낱개 수
    val penBundles = n / p
    val penSingles = n % p
    println("$penBundles $penSingles")
}