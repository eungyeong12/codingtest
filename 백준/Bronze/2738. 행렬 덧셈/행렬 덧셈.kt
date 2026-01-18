fun main() {
    val (n, _) = readln().split(" ").map { it.toInt() }
    val arr1 = List(n) { readln().split(" ").map { it.toInt() } }
    val arr2 = List(n) { readln().split(" ").map { it.toInt() } }
    val result = arr1.zip(arr2) { row1, row2 ->
        row1.zip(row2) { a, b -> a + b }
    }
    println(result.joinToString("\n") { it.joinToString(" ") })
}