fun main() = with(System.`in`.bufferedReader()) {
    val sb = StringBuilder()
    val m = readLine().toInt()
    var bitSet = 0
    repeat(m) {
        val input = readLine().split(" ")
        when (input[0]) {
            "add" -> {
                val x = input[1].toInt()
                bitSet = bitSet or (1 shl x)
            }
            "remove" -> {
                val x = input[1].toInt()
                bitSet = bitSet and (1 shl x).inv()
            }
            "check" -> {
                val x = input[1].toInt()
                sb.appendLine(if (bitSet and (1 shl x) != 0) 1 else 0)
            }
            "toggle" -> {
                val x = input[1].toInt()
                bitSet = bitSet xor (1 shl x)
            }
            "all" -> {
                bitSet = (1 shl 21) - 1
            }
            "empty" -> {
                bitSet = 0
            }
        }
    }
    println(sb)
}