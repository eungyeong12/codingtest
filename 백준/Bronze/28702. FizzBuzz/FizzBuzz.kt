fun fizzBuzzValue(i: Int): String {
    return when {
        i % 15 == 0 -> "FizzBuzz"
        i % 3 == 0 -> "Fizz"
        i % 5 == 0 -> "Buzz"
        else -> i.toString()
    }
}

fun main() {
    val arr = Array(3) { readln() }
    
    for (idx in 0..2) {
        val num = arr[idx].toIntOrNull()
        if (num != null) {
            val i = num - idx
            if ((0..2).all { fizzBuzzValue(i + it) == arr[it] }) {
                println(fizzBuzzValue(i + 3))
                break
            }
        }
    }
}