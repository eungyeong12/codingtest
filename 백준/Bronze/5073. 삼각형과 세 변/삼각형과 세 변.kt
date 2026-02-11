fun main() {
    while (true) {
        val triangle = readln().split(" ").map { it.toInt() }
        if (triangle[0] == 0 && triangle[1] == 0 && triangle[2] == 0) return

        if (triangle.max() >= triangle.sum() - triangle.max()) {
            println("Invalid")
        } else if (triangle[0] == triangle[1] && triangle[1] == triangle[2]) {
            println("Equilateral")
        } else if (triangle[0] != triangle[1] && triangle[1] != triangle[2] && triangle[2] != triangle[0]) {
            println("Scalene")
        } else {
            println("Isosceles")
        }
    }
}