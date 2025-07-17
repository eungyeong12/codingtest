fun main() {
    val n = readln().toInt()
    var count = 0
    var number = 666
    while (true) {
        if (number.toString().contains("666")) {
            count++;
            if (count == n) {
                println(number)
                break;
            }
        }
        number++
    }
}