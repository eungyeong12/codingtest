class Solution {
    fun solution(sizes: Array<IntArray>): Int {
        var maxWidth = 0
        var maxHeight = 0
        
        for (size in sizes) {
            val width = maxOf(size[0], size[1])
            val height = minOf(size[0], size[1])
            
            maxWidth = maxOf(maxWidth, width)
            maxHeight = maxOf(maxHeight, height)
        }
        
        return maxWidth * maxHeight
    }
}