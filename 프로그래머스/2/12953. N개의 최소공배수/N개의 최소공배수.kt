class Solution {
    fun solution(arr: IntArray): Int {
        var answer = arr[0]
        for (i in 1 until arr.size) {
            answer = lcm(answer, arr[i])
        }
        return answer
    }
    
    private fun gcd(a: Int, b: Int): Int = if (b != 0) gcd(b, a % b) else a
    private fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
}