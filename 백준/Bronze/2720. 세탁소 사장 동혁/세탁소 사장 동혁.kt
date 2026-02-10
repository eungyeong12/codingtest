fun main() {
    val t = readln().toInt()
    repeat(t) {
        val c = readln().toInt() 
        val quarter = c / 25
        val dime = c % 25 / 10
        val nickel = c % 25 % 10 / 5
        val penny = c % 25 % 10 % 5
        println("$quarter $dime $nickel $penny")
    }
}


