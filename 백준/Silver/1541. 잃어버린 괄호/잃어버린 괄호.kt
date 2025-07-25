fun main() = with(System.`in`.bufferedReader()) {
    val input = readLine()
    val splitByMinus = input.split("-")
    
    var result = 0
    
    for ((i, part) in splitByMinus.withIndex()) {
        val sum = part.split("+").sumOf { it.toInt() }
        if (i == 0) {
            result += sum
        } else {
            result -= sum
        }
    }
    println(result)
}