fun main() {
    while (true) {
        try {
            var space = 0
            var digit = 0
            var lower = 0
            var upper = 0
            val s = readln()
            if (s.isEmpty()) return
            
            s.forEach {
                when {
                    it == ' ' -> space++
                    it.isDigit() -> digit++
                    it.isLowerCase() -> lower++
                    it.isUpperCase() -> upper++
                }
            }
            println("$lower $upper $digit $space")
        } catch (e: Exception) {
            return
        }
    }
}