class Solution {
    private val numberSet = mutableSetOf<Int>()
    
    fun solution(numbers: String): Int {
        val visited = BooleanArray(numbers.length)
        makeNumbers(numbers, "", visited)
        return numberSet.count { isPrime(it) }
    }
    
    private fun makeNumbers(
        numbers: String,
        current: String,
        visited: BooleanArray
    ) {
        if (current.isNotEmpty()) {
            numberSet.add(current.toInt())
        }
        
        for (i in numbers.indices) {
            if (!visited[i]) {
                visited[i] = true
                makeNumbers(numbers, current + numbers[i], visited)
                visited[i] = false
            }
        }
    }
    
    private fun isPrime(number: Int): Boolean {
        if (number < 2) return false
        
        for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
            if (number % i == 0) return false
        }
        
        return true
    }
}