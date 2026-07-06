import java.util.*

class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        val answer = mutableListOf<Int>()
        val list = array.toList()
        for (command in commands) {
            val sub = list.subList(command[0] - 1, command[1])
            answer.add(sub.sorted()[command[2] - 1])
        }
        return answer.toIntArray()
    }
}