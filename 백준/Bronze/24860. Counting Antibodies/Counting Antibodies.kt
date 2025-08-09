fun main() {
    val (vk, jk) = readln().split(" ").map { it.toLong() }
    val (vl, jl) = readln().split(" ").map { it.toLong() }
    val (vh, dh, jh) = readln().split(" ").map { it.toLong() }
    
    val light = vk * jk + vl * jl
    val heavy = vh * dh * jh
    val ans = heavy * light 
    println(ans)
}