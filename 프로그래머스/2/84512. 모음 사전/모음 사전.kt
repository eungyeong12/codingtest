class Solution {
    fun solution(word: String): Int {
        val vowels = charArrayOf('A', 'E', 'I', 'O', 'U')
        val dictionary = mutableListOf<String>()
        
        fun dfs(current: String) {
            if (current.length == 5) {
                return
            }
            
            for (vowel in vowels) {
                val next = current + vowel
                dictionary.add(next)
                dfs(next)
            }
        }
        
        dfs("")
        
        return dictionary.indexOf(word) + 1
    }
}