class Solution {
    fun solution(begin: String, target: String, words: Array<String>): Int {
        if (!words.contains(target)) return 0
        
        val visited = BooleanArray(words.size)
        val queue = ArrayDeque<Pair<String, Int>>()
        
        queue.add(Pair(begin, 0))
        
        while (queue.isNotEmpty()) {
            val (currentWord, step) = queue.removeFirst()
            
            if (currentWord == target) {
                return step
            }
            
            for (i in words.indices) {
                if (!visited[i] && isChangable(currentWord, words[i])) {
                    visited[i] = true
                    queue.add(Pair(words[i], step + 1))
                }
            }
        }
        
        return 0
    }
    
    private fun isChangable(word1: String, word2: String): Boolean {
        var diffCount = 0
        for (i in word1.indices) {
            if (word1[i] != word2[i]) {
                diffCount++
                if (diffCount > 1) return false
            }
        }
        
        return diffCount == 1
    }
}