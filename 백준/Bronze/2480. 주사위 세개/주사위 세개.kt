fun main() = with(System.`in`.bufferedReader()) {
    val (a, b, c) = readLine().split(" ").map { it.toInt() }
    if (a == b && b == c) {
        print(10000 + a * 1000)
    } else if (a == b || b == c || c == a) {
        if (a == b || a == c) {
            print(1000 + a * 100)
        } else {
            print(1000 + b * 100)
        }
    } else {
        print(maxOf(a, b, c) * 100)
    }
}