/*
Crie um programa capaz de atender os requisitos abaixo:
a. Crie um novo arquivo com uma função main.
b. Declare uma variável mutável capaz de armazenar seu nome completo.
c. Declare uma variável de texto sem valor algum.
d. Declare uma variável imutável com o menor tipo de dado possível capaz de armazenar o número que você
calça.
e. Declare uma variável capaz de armazenar o PIB do Brasil (1.869.000.000.000).
f. Declare uma variável capaz de armazenar a população do Brasil (211.000.000).
g. Imprima o valor do PIB per capita.
h. Rode seu programa de maneira que não tenha erros de compilação ou execução


fun main(){
    var nome: String = "Rodrigo Seliprin Cezar"
    var textoVazio: String
    val calcado: Byte = 38

    val PIB: Long = 1869000000000
    val pop = 211000000
    println("${Int.MAX_VALUE}")

    println("RS ${PIB/pop}")

}

 */

/*
1 Escreva uma função que seja capaz de receber a quantidade de anos e transformar em meses, dias, horas,
minutos e segundos. Saída desejada:
2 anos equivalem a:
24 meses
730 dias
17520 horas
1051200 minutos
63072000 segundos


2 Escreva uma função capaz de receber uma string e retornar a quantidade de caracteres.

3 Escreva uma função capaz de calcular o cubo de um número inteiro (cubo = n*n*n).

4 Escreva uma função capaz de receber milhas e converter em km (1 milha = 1,6km).

5 Escreva um programa que seja capaz de receber uma string e fazer a troca de todas as letras “a” ou “A” por “x”.
a. Não deve existir lógica dentro da função main. Deve ser usada somente como ponto de entrada.
b. Escrever uma função para a troca de letras e impressão do valor final.
c. String final deve estar com todas as letras minúsculas.

6 Sobre as funções criadas nos exercícios 2, 3 e 4. É possível transformá-las em funções de uma única linha? Se
sim, transforme-as.
 */

fun ex5(str: String){
    println(str.replace("a", "x", true).lowercase())
}

fun caracteres(str: String) = str.length

fun cubo(n: Int) = n * n * n

fun milhasKm(milhas: Float): Float = milhas * 1.6f

fun converteAnos(anos: Int) {
    println("$anos sanos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")

}

fun main() {
    // converteAnos(2)
    println(caracteres("Lorem ipsum lorem ipsum lorem ipsum"))
    println(cubo(3))
    println(milhasKm(100f))
    ex5("Aaaaa BBBBBBbbbbAAAAaaa aheapeaeu ui hh b x X apmaolje.")
}