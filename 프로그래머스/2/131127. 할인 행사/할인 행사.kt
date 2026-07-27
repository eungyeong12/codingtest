class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer = 0
        
        val wantMap = mutableMapOf<String, Int>()
        for (i in want.indices) {
            wantMap[want[i]] = number[i]
        }
        
        val currentMap = mutableMapOf<String, Int>()
        for (i in 0 until 10) {
            currentMap[discount[i]] = currentMap.getOrDefault(discount[i], 0) + 1
        }
        
        if (currentMap == wantMap) answer++
        
        for (i in 10 until discount.size) {
            val removeKey = discount[i - 10]
            currentMap[removeKey] = currentMap[removeKey]!! - 1
            if (currentMap[removeKey] == 0) {
                currentMap.remove(removeKey)
            }
            
            val addKey = discount[i]
            currentMap[addKey] = currentMap.getOrDefault(addKey, 0) + 1
            
            if (currentMap == wantMap) answer++
        }
        
        return answer
    }
}