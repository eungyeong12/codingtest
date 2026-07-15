class Solution {
    fun solution(name: String): Int {
        var answer = 0

        for (char in name) {
            val up = char - 'A'
            val down = 'Z' - char + 1

            answer += minOf(up, down)
        }

        var minMove = name.length - 1

        for (i in name.indices) {
            var next = i + 1

            while (next < name.length && name[next] == 'A') {
                next++
            }

            val moveRightThenLeft = i * 2 + (name.length - next)

            val moveLeftThenRight = i + (name.length - next) * 2
            
            minMove = minOf(
                minMove,
                moveRightThenLeft,
                moveLeftThenRight
            )
        }
        
        return answer + minMove
    }
}