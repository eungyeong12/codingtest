class Solution {
    fun solution(elements: IntArray): Int {
        val size = elements.size
        val extendedElements = elements + elements
        val sums = HashSet<Int>()
        
        for (len in 1..size) {
            for (i in 0..<size) {
                val subSum = extendedElements.sliceArray(i..<i + len).sum()
                sums.add(subSum)
            }
        }
        
        return sums.size
    }
}