// Null safety: Funcionalidade do Kotlin, que tenta prevenir que erros aconteçam nas variáveis que possam ser nulas

fun main() {
    var s: String? = null   // "?" - Para que o KT aceite o nulo


    println(s?.length)     // ?: Pede para o Kotlin tratar caso haja algum problema -- !!: Nós vamos assumir o erro

    var abc = readLine()
    if (abc != null && abc != "") {

    }
}