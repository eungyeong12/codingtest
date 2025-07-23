fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    repeat(t) {
        val n = readLine().toInt()
        val map = HashMap<String, Int>()
        repeat(n) {
            val (_, type) = readLine().split(" ")
            map[type] = map.getOrDefault(type, 0) + 1
        }
        
        var result = 1
        for ((_, count) in map) {
            result *= (count + 1) // 입는 경우 + 안 입는 경우
        }
        
        println(result - 1) // 아무것도 안 입는 경우 제외
    }
}