class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val total = brown + yellow
        
        for (height in 3..total) {
            if (total % height != 0) continue
            
            val width = total / height
            
            if (width < height) continue
            
            if ((width - 2) * (height - 2) == yellow) {
                return intArrayOf(width, height)
            }
        }
        
        return intArrayOf()
    }
}