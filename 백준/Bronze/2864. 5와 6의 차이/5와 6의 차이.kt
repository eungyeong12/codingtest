fun main() {
    val list = readln().split(" ")
    print("${list.sumOf {
        val sb = StringBuilder()
        it.forEach { ch ->
            if (ch == '6') sb.append('5') else sb.append(ch)
        }
        sb.toString().toInt()
    }} ")
    print(list.sumOf {
        val sb = StringBuilder()
        it.forEach { ch ->
            if (ch == '5') sb.append('6') else sb.append(ch)
        }
        sb.toString().toInt()
    })
}