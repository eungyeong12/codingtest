class Solution {
    fun solution(n: Int, lost: IntArray, reserve: IntArray): Int {
        val clothes = IntArray(n + 1) { 1 }
        
        for (student in lost) {
            clothes[student]--
        }
        
        for (student in reserve) {
            clothes[student]++
        }
        
        for (student in 1..n) {
            if (clothes[student] == 0) {
                when {
                    student > 1 && clothes[student - 1] == 2 -> {
                        clothes[student - 1]--
                        clothes[student]++
                    }
                    student < n && clothes[student + 1] == 2 -> {
                        clothes[student + 1]--
                        clothes[student]++
                    }
                }
            }
        }
        
        return clothes.count { it >= 1 } - 1
    }
}