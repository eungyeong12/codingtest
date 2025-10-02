fun main() = with(System.`in`.bufferedReader()) {
    val a = readLine().toInt()
    val b = readLine().toInt()
    
    val bOnes = b % 10
    val bTens = (b / 10) % 10
    val bHundreds = b / 100
    
    println(a * bOnes)
    println(a * bTens)
    println(a * bHundreds)
    println(a * b)
}