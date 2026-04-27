class Solution {
    fun solution(s: String): String {
        var nums = s.split(" ").map { it.toInt() }
        return "${nums.minOrNull()} ${nums.maxOrNull()}"
    }
}