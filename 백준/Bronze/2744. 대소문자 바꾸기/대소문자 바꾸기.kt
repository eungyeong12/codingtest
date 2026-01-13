fun main() {
    val s = readln()
    s.forEach { 
        print(if (it.isUpperCase()) it.lowercase() else it.uppercase())
    }
}