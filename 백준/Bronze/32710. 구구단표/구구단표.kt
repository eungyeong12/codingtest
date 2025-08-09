fun main() {
    val n = readln().toInt()
    if (n in 1..9) {
        println(1)
        return
    }
    
    for (a in 2..9) {
        if (n % a == 0) {
            val b = n / a
            if (b in 1..9) {
                println(1)
                return
            }
        }
    }
    
    println(0)
}