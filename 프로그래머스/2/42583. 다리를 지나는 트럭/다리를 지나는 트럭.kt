class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        val bridge = ArrayDeque<Int>()
        
        repeat(bridge_length) {
            bridge.add(0)
        }
        
        var time = 0
        var currentWeight = 0
        var truckIndex = 0
        
        while (truckIndex < truck_weights.size) {
            time++

            val finishedTruck = bridge.removeFirst()
            currentWeight -= finishedTruck
            
            val nextTruck = truck_weights[truckIndex]
            
            if (currentWeight + nextTruck <= weight) {
                bridge.addLast(nextTruck)
                currentWeight += nextTruck
                truckIndex++
            } else {
                bridge.addLast(0)
            }
        }
        
        return time + bridge_length
    }
}