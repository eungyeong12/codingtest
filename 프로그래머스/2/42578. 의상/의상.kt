class Solution {
    fun solution(clothes: Array<Array<String>>): Int {
        val map = mutableMapOf<String, Int>()
        
        for (cloth in clothes) {
            val type = cloth[1]
            map[type] = map.getOrDefault(type, 0) + 1
        }
        
        var answer = 1
        
        for (count in map.values) {
            answer *= count + 1
        }
        
        return answer - 1
    }
}