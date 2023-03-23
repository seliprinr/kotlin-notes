/*
Controle de fluxo - for

1 Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”

2 Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1”

3 Usando a resolução do exercício 1, não imprima os números múltiplos de 5

4 Faça a soma de todos os números no intervalo de 1 a 500.

5 Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #.

- Se a entrada do programa for 3, teremos:
#
##
###

Se a entrada do programa for 5, teremos:
#
##
###
####
#####

Controle de fluxo - while

1 Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?

2 FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

3 Escreva um programa capaz de receber um texto e imprimi-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM

4 Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false

DESAFIO
Ana e Paula são duas programadoras da empresa XDM. A empresa XDM possui um benefício para incentivar os funcionários a
pouparem dinheiro para a aposentadoria que funciona da seguinte maneira:
Se o funcionário destinar 5% do seu salário para o investimento, a empresa acrescenta o mesmo valor. Ou seja, caso o
funcionário invista 100 reais, a empresa investe mais 100. Este fundo de investimento possui rendimento de 0,2% ao mês.
Ana adorou a ideia e vai investir. No entanto, Paula decidiu que vai investir os mesmos 5% por conta própria já que conhece
investimentos que rendem mais que 0,2% ao mês. Paula vai escolher investimentos que rendem 0,8% ao mês.
Considere o salário de Ana e Paula iguais e no valor de 10 mil reais e que as duas estão começando com saldo 0 e que investirão
5% do salário.

 */

fun ex1() {
    for (i in 1..50) {
        print("$i ")
    }
}

fun ex2() {
    for (i in 50 downTo 1) {
        print("$i ")
    }
}

fun ex3() {
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }

}

fun ex4() {
    var soma = 0
    for (i in 1..500) {
        soma += i
    }

    println(soma)
}

fun ex5(n: Int) { // 1-5
    for (i in 1..n) { // 1-5 // 1..
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun while1() {
    val capCaixa = 2000
    val capBalao = 7

    var numBaloes = 0
    while ((numBaloes * capBalao) + capBalao < capCaixa) {
        numBaloes++
    }

    println("Cabem $numBaloes balões na caixa d'água.")
}

fun exercicio2() {
    var i = 1
    while (i <= 50) {
        if (i % 15 == 0) {
            print("FizzBuzz ")
        } else if (i % 3 == 0) {
            print("Buzz ")
        } else if (i % 5 == 0) {
            print("Fizz ")
        } else {
            print("$i ")
        }
        i++
    }
}

fun exercicio3(str: String) {
    var i = str.length - 1
    while (i >= 0) {
        print(str[i])
        i--
    }
}

fun exercicio4(str: String): Boolean {
    val strLower = str.lowercase()
    var countX = 0
    var countO = 0

    var i = 0
    while (i < str.length) {
        if (strLower[i] == 'x') { // 'caractere'
            countX++
        } else if (strLower[i] == 'o') {
            countO++
        }
        i++
    }

    return ((countX == countO) && (countX != 0))
}


fun main() {
    println(exercicio4("Xxooox")) // true
    println(exercicio4("xxxxo")) // false
    println(exercicio4("bdefghij")) // false
    println(exercicio4("ooooxzzzzz")) // false
}