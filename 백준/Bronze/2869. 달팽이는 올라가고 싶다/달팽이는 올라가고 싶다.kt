fun main() {
    val (a, b, v) = readln().split(" ").map { it.toInt() }
    // 하루에 올라가는 거리 : a - b
    // 마지막 날에 미끄러지는 것 고려하여 v - b 이상 올라가면 됨
    // 소수점이 있으면 올림 처리
    val days = (v - b + (a - b - 1)) / (a - b)
    println(days)
}