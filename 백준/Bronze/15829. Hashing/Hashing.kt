fun main() {
    val l = readln()!!.toInt()
    val s = readln()!!
    val r = 31L
    val m = 1234567891L
    
    var hash = 0L
    var pow = 1L
    for (i in 0 until l) {
        val ai = s[i] - 'a' + 1
        hash = (hash + ai * pow) % m
        pow = (pow * r) % m
    }
    println(hash)
}