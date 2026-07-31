import java.util.*

class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer = IntArray(numbers.size) { -1 }
        
        val stack = Stack<Int>()
        
        for (i in numbers.indices) {
            while (stack.isNotEmpty() && numbers[stack.peek()] < numbers[i]) {
                val popIdx = stack.pop()
                answer[popIdx] = numbers[i]
            }
            stack.push(i)
        }
        
        return answer
    }
}