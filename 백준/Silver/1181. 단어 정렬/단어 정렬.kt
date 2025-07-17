fun main() {
    val n = readln().toInt()
    val words = mutableSetOf<String>()
    repeat(n) {
        words.add(readln())
    }
    val sortedWords = words.sortedWith(compareBy({ it.length }, { it }))
    for (word in sortedWords) {
        println(word)
    }
}