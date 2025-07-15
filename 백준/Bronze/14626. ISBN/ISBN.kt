fun main() {
    val isbn = readln()
    val starIdx = isbn.indexOf("*")
    
    for (candidate in 0..9) {
        var sum = 0
        for (i in 0..11) {
            val digit = when (i) {
                starIdx -> candidate
                else -> isbn[i].digitToInt()
            }
            sum += digit * if (i % 2 == 0) 1 else 3
        }
        val m = isbn[12].digitToInt()
        if ((sum + m) % 10 == 0) {
            println(candidate)
            return
        }
    }
}