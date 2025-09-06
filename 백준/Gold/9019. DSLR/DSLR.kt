import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val t = readLine().toInt()
    val sb = StringBuilder()
    
    repeat(t) {
        val (a, b) = readLine().split(" ").map { it.toInt() }
        val visited = BooleanArray(10000)
        val queue = ArrayDeque<Pair<Int, String>>()
        
        queue.add(Pair(a, ""))
        visited[a] = true
        
        while (queue.isNotEmpty()) {
		        val (currentNum, currentPath) = queue.removeFirst()
		        
		        if (currentNum == b) {
				        sb.appendLine(currentPath)
				        break
				    }
				    
				    // D
				    val dResult = (currentNum * 2) % 10000
				    if (!visited[dResult]) {
						    visited[dResult] = true
						    queue.add(Pair(dResult, currentPath + "D"))
						}
						
						// S
						val sResult = if (currentNum == 0) 9999 else currentNum - 1
						if (!visited[sResult]) {
								visited[sResult] = true
								queue.add(Pair(sResult, currentPath + "S"))
					  }
					  
					  // L
					  val lResult = (currentNum % 1000) * 10 + currentNum / 1000
					  if (!visited[lResult]) {
							  visited[lResult] = true
							  queue.add(Pair(lResult, currentPath + "L"))
					  }
					  
					  // R
					  val rResult = (currentNum % 10) * 1000 + currentNum / 10
					  if (!visited[rResult]) {
							  visited[rResult] = true
							  queue.add(Pair(rResult, currentPath + "R"))
						}
				}
    }
    print(sb)
}