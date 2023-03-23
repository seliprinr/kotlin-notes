
/*
fun helloWorld(nome:String):String{
    return "Olá, $nome!"
}
*/

// fun -> Declara o que é uma função
// helloWorld -> Nome da função
// nome -> Identificador
// : -> Parâmetro
// String -> Tipo
// :String -> Tipo de retorno
// { -> Início
// return -> Comando de retorno
// return "Olá, $nome!" -> Corpo da função
// } -> Fim

// TIPOS DE RETORNO:
/*
Unit -> Diz que uma função não possui retorno,
a função executa seu corpo e termina sua execução.

Double, Float, Long, Int, Short, Byte, Boolean, String e Char
-> Uma função também pode executar seu corpo e fornecer
uma resposta para seu chamador.
Os mesmos tipos que são usados para declaração de variáveis,
servem como retorno de funções

Instâncias de classes -> Uma função é capaz de
retornar um tipo de dado resultante da
instância de uma classe.
 */

fun main(){
    //helloWorld()
   // println("A soma de 10 e 5 é ${sun(10, 5)}")
    println(divisao(10f,2.4f))
}

fun sun(a: Int, b: Int): Int{
    return (a + b)
}

fun helloWorld(){
    println("Hello World!")
}

// FUNÇÕES EM UMA ÚNICA LINHA: instrução
fun sun2 (a: Int, b: Int) = (a + b)
fun helloWorld2() = println("Olá mundo!")
fun divisao(a: Float, b: Float) = a/b