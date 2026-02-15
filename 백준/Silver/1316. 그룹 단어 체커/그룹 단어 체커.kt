fun main() {
    val set = mutableSetOf<Char>()
    val n =  readln().toInt()
    val list = List(n) { readln() }
    println(list.count { word ->
        set.clear()
        var boolean = true
        word.forEachIndexed { index, ch ->
            if (index == 0) {
                set.add(ch)
            } else if (ch !in set) {
                set.add(ch)
            } else if (ch in set && word[index - 1] != ch) {
                boolean = false
            }
        }
        boolean
    })
}