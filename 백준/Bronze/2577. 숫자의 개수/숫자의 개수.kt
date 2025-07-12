fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()
    val result = (a * b * c).toString()
    
    for (digit in '0'..'9') {
        println(result.count { it == digit })
    }
}