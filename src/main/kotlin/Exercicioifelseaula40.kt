/*
1 Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).

2 Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).

3 Considere o código abaixo. Qual a saída do programa caso informado o valor 4?
fun qualASaida(num: Int) {
 if (num >= 0) {
 if (num == 0)
 println("Primeira string")
 else println("Segunda string")
 }
 println("Terceira string")
}

4 Escreva um programa para ser usado na de portaria de um evento.
a. Peça a idade. Menores de idade não são permitidos. Mensagem: “Negado. Menores de idade não são
permitidos.”.
b. Peça o tipo de convite. Os tipos de convite são comum, premium e luxo. Negar a entrada caso não seja nenhum
destes. Mensagem: “Negado. Convite inválido.”.
c. Peça o código do convite. Convites premium e luxo começam com “XL”. Convites comuns começam com “XT”.
Caso o código não esteja nos padrões, negar a entrada. Mensagem: “Negado. Convite inválido.”.
d. Caso todos os critérios sejam satisfeitos, exibir “Welcome :)”.
 */

fun portaria() {
    println("Qual sua idade?")
    val idade = readLine()


    if (idade != null && idade != "") {
        if (idade.toInt() < 18) {
            println("Negado. Menores de idade não são permitidos.")
            return
        }
    }

    println("Qual é o tipo de convite? ")
    var tipoConvite = readLine()

    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()
        if (tipoConvite == "comum" || tipoConvite == "premium" || tipoConvite == "luxo") {

            println("Qual o código do convite? ")
            var codigo = readLine()

            if (codigo != null && codigo != "") {
                codigo = codigo.lowercase()
                if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                    println("Welcome")
                } else if(tipoConvite == "premium" || tipoConvite == "luxo"
                    && codigo.startsWith("xl")) {
                    println("Welcome :)")
                } else {
                    println("Negado, convite inválido.")
                }
            }
        } else {
            println("Negado. Convite inválido.")
        }
    }

}

fun quadrado() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != "") {
        val x = lado1.toInt()
        val y = lado2.toInt()

        if (x == y) {
            println("É um quadrado")
        } else {
            println("Não é um quadrado")
        }
    }
}

fun triangulo() {
    println("Informe o lado 1: ")
    val lado1 = readLine()

    println("Informe o lado 2: ")
    val lado2 = readLine()

    println("Informe o lado 3: ")
    val lado3 = readLine()

    if (lado1 != null && lado1 != "" && lado2 != null && lado2 != ""
        && lado3 != null && lado3 != ""
    ) {
        val x = lado1.toInt()
        val y = lado2.toInt()
        val z = lado3.toInt()

        if (x == y && y == z) {
            println("É um triângulo equilátero")
        } else {
            println("Não é um triângulo equilátero")
        }
    }
}

fun qualASaida(num: Int) {
    if (num >= 0) {
        if (num == 0)
            println("Primeira string")
        else println("Segunda string")
    }
    println("Terceira string")
}

fun main() {
    portaria()
}