fun main() {
    val set = setOf("c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var count = 0
    val s = readln()
    var i = 0
    while (i <= s.lastIndex) {
        if (i == s.lastIndex) {
            count++
            break
        }
        if (i + 2 <= s.lastIndex && (s[i].toString() + s[i + 1].toString() + s[i + 2].toString()) in set) {
            count++
            i += 3
            continue
        }
        if ((s[i].toString() + s[i + 1].toString()) in set) {
            count++
            i += 2
            continue
        }
        count++
        i++
    }
    println(count)
}