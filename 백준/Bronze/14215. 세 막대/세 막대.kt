fun main() {
    val triangle = readln().split(" ").map { it.toInt() }
    if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
        println(triangle.sum())
    } else {
        val max = triangle.max()
        val remain = triangle.sum() - max
        println(remain * 2 - if (remain - max > 0) remain - max else 1)
    }
}