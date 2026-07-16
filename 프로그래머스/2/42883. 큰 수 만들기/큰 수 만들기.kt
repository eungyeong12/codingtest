class Solution {
    fun solution(number: String, k: Int): String {
        val stack = StringBuilder()
        var removeCount = k
        
        for (digit in number) {
            while (
                stack.isNotEmpty() &&
                removeCount > 0 &&
                stack.last() < digit
            ) {
                stack.deleteCharAt(stack.lastIndex)
                removeCount--
            }
            
            stack.append(digit)
        }
        
        return stack.substring(0, number.length - k)
    }
}