fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val nums = IntArray(n) { readLine().toInt() }
    nums.sort()
    
    val avg = Math.round(nums.average())
    val med = nums[n / 2]
    
    val freq = IntArray(8001)
    var maxFreq = 0
    for (num in nums) {
        val idx = num + 4000
        freq[idx]++
        maxFreq = maxOf(maxFreq, freq[idx])
    }
    
    val modeList = mutableListOf<Int>()
    for (i in freq.indices) {
        if (freq[i] == maxFreq) {
            modeList.add(i - 4000)
        }
    }
    
    val mode = if (modeList.size > 1) modeList[1] else modeList[0]
    
    val range = nums.last() - nums.first()
    
    println(avg)
    println(med)
    println(mode)
    println(range)
}