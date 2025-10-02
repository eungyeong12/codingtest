fun main() = with(System.`in`.bufferedReader()) {
    val (a, b) = readLine().split(" ").map { it.toInt() }
    val c = readLine().toInt()
    val currentMinutes = a * 60 + b
    val result = currentMinutes + c
    
    var h = result / 60
    var m = result % 60
    
    if (h >= 24) {
        h %= 24
    }
    println("$h $m")
}