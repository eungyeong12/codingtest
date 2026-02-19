fun main() {
    val n = readln().toInt()
    val list = List(n) { readln() }
    (0 until list[0].length).forEach {
        if (list.all { element -> element[it] == list[0][it] }) {
            print(list[0][it])
        } else {
            print("?")
        }
    }
}