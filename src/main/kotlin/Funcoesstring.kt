fun main(){
    val str = "Programação Kotlin."

    println("Tamanho da string: ${str.length}")

    println("Posição do (index) 0 da string: ${str[0]}")
    println(str.startsWith("Pro"))
    println(str.endsWith("abc"))
    println(str.substring(2, 4))
    println(str.replace("Kotlin.", "Kotlin é show!"))
    println(str.lowercase())
    println(str.uppercase())

    println("                Meu nome é          ".trim())
}


fun soma(){}
fun soma(a: Int){}
fun soma(a: Int, b: Int){}