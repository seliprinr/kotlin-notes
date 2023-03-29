fun main() {

    val str: String? = null     // String nula e tipo que permite nulo (?Ponto de interrogação)
    println(str ?: "nulo")      // Operador Elvisverifica a variável que está na esquerda, caso ela seja nula, ele executa a instrução da direita
}
