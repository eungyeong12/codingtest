import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    repeat(t) {
        val k = readLine().toInt()
        val minHeap = PriorityQueue<Int>()
        val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder())
        val countMap = HashMap<Int, Int>()
        
        fun removeInvalidValues(heap: PriorityQueue<Int>) {
            while (heap.isNotEmpty() && countMap.getOrDefault(heap.peek(), 0) == 0) {
                heap.poll()
            }
        }
        
        repeat(k) {
            val (command, numStr) = readLine().split(" ")
            val num = numStr.toInt()
            
            when (command) {
                "I" -> {
                    minHeap.add(num)
                    maxHeap.add(num)
                    countMap[num] = countMap.getOrDefault(num, 0) + 1
                }
                "D" -> {
                    if (countMap.isNotEmpty()) {
                        val targetHeap = if (num == 1) maxHeap else minHeap
                        removeInvalidValues(targetHeap)

                        if (targetHeap.isNotEmpty()) {
                            val value = targetHeap.poll()
                            countMap[value] = countMap[value]!! - 1
                            if (countMap[value] == 0) {
                                countMap.remove(value)
                            }
                        }
                    }
                }
            }
        }
        
        removeInvalidValues(maxHeap)
        removeInvalidValues(minHeap)
        
        if (countMap.isEmpty()) {
            println("EMPTY")
        } else {
            println("${maxHeap.peek()} ${minHeap.peek()}")
        }
    }
}