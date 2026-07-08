class Solution {
    fun solution(answers: IntArray): IntArray {
        val patterns = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(2, 1, 2, 3, 2, 4, 2, 5),
            intArrayOf(3, 3, 1, 1, 2, 2, 4, 4, 5, 5)
        )
        
        val scores = IntArray(3)
        
        for (i in answers.indices) {
            for (j in patterns.indices) {
                if (answers[i] == patterns[j][i % patterns[j].size]) {
                    scores[j]++
                }
            }
        }
        
        var maxScore = scores.max()
        
        return scores
            .mapIndexed { index, score -> index + 1 to score }
            .filter { it.second == maxScore }
            .map { it.first }
            .toIntArray()
    }
}