fun main() {
    var count = 1
    while (true) {
        val input = readln()
        if (input == "0") return
        val nums = input.split(" ")
            .filter { it.isNotBlank() }.map { it.toInt() }.drop(1)
        val mid = nums.size / 2
        if (nums.size % 2 == 1) {
            println("Case ${count++}: ${nums[mid].toDouble()}")
        } else {
            println("Case ${count++}: ${(nums[mid - 1] + nums[mid]) / 2.0}")
        }
    }
}