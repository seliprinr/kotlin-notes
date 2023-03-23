fun main() {
    val s = "Kotlin"
    var i = 0

    while (i > 0) {
        print(i)
        i--
    }

    while (i < s.length) { // enquanto
        print("${s[i]}")
        i++
    }
}