fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val sb = StringBuilder()
    repeat(t) {
        val p = readLine()
        val n = readLine().toInt()
        val arrLine = readLine()
        val arr = if (n == 0) IntArray(0)
        else arrLine.substring(1, arrLine.length - 1)
            .split(',')
            .map { it.toInt() }
            .toIntArray()
        
        var left = 0
        var right = n - 1
        var rev = false
        var error = false
        
        for (c in p) {
            when (c) {
                'R' -> rev = !rev
                'D' -> {
                    if (left > right) {
                        error = true
                        break
                    }
                    if (!rev) left++ else right--
                }
            }
        }
        
        if (error) {
            sb.appendLine("error")
        } else {
            sb.append("[")
            val slice = arr.copyOfRange(left, right + 1)
            if (rev) slice.reverse()
            slice.joinTo(sb, ",")
            sb.appendLine("]")
        }
    }
    print(sb)
}