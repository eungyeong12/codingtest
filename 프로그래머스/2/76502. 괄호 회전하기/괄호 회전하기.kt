class Solution {
    fun solution(s: String): Int {
        var answer = 0

        if (s.length % 2 != 0) return 0

        for (i in s.indices) {
            val rotated = s.substring(i) + s.substring(0, i)

            if (isValid(rotated)) {
                answer++
            }
        }

        return answer
    }

    private fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (c in s) {
            when (c) {
                '(', '{', '[' -> stack.addLast(c)
                ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
                '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
                ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
            }
        }

        return stack.isEmpty()
    }
}