fun main() {
    val arr = List(8) { readln() }
    var count = 0
    arr.forEachIndexed { index, strings ->
        if (index % 2 == 0) {
            strings.forEachIndexed { i, c ->
                if (i % 2 == 0 && c == 'F') count++
            }
        }
        if (index % 2 == 1) {
            strings.forEachIndexed { i, c ->
                if (i % 2 == 1 && c == 'F') count++
            }
        }
    }
    println(count)
}