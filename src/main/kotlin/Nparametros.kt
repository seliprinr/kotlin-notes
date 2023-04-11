fun main() {
    println(media(false, 2, "", false))


    arrayOf(2, 6, 2, 4, 45f, false)
    "aheahee".startsWith("ah")

}

// Generics: Normalmente a letra usada para representar é "T"

fun <T, J> media(abc: J, vararg notas: T): Float {
    var soma = 0f
    for (n in notas) {
        if(n is Float)
        soma += n
    }
    return (soma / notas.size)
}

fun salary(salary: Float, hourlyRate: Float = 200.0f, workedTime: Float) : Float {
    return salary / hourlyRate * workedTime
    salary(7000.0f, 300f, 5f)
}

