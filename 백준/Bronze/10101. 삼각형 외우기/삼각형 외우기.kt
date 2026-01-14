fun main() {
    val angle = List(3) { readln() }.map { it.toInt() }
    if (angle.all { it == 60 }) {
        println("Equilateral")
        return
    }
    if (angle.sum() != 180) {
        println("Error")
        return
    }
    if (angle.sum() == 180 && angle.size == angle.distinct().size) {
        println("Scalene")
        return
    }
    println("Isosceles")
}
