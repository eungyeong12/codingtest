fun main() {
    var bin = readln()
    
    while (bin.length % 3 != 0) {
        bin = "0$bin"
    }
    
    val sb = StringBuilder()
    for (i in bin.indices step 3) {
        val part = bin.substring(i, i + 3)
        sb.append(part.toInt(2))
    }
    println(sb)
}