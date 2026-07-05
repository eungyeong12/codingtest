import java.util.*

class Solution {
    fun solution(operations: Array<String>): IntArray {
        val queue = TreeMap<Int, Int>()
        
        for (operation in operations) {
            val parts = operation.split(" ")
            val command = parts[0]
            val number = parts[1].toInt()
            
            when (command) {
                "I" -> {
                    queue[number] = queue.getOrDefault(number, 0) + 1
                }
                "D" -> {
                    if (queue.isEmpty()) continue
                    
                    val target = if (number == 1) {
                        queue.lastKey()
                    } else {
                        queue.firstKey()
                    }
                    
                    val count = queue[target]!!
                    
                    if (count == 1) {
                        queue.remove(target)
                    } else {
                        queue[target] = count - 1
                    }
                }
            }
        }
        
        return if (queue.isEmpty()) {
            intArrayOf(0, 0)
        } else {
            intArrayOf(queue.lastKey(), queue.firstKey())
        }
    }
}