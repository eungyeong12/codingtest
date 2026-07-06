class Solution {
    fun solution(citations: IntArray): Int {
        var h = citations.max()
        while (h >= 0) {
            val count = citations.count { it >= h }
            if (h <= count && citations.size - count <= h) {
                return h
            }
            h--
        }
        return 0
    }
}