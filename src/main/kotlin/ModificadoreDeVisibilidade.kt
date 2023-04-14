private class X private constructor()

open class Eletronico (var marca: String) {
    protected fun ativarCorrente(s: String {}
    fun ligar() {
        ativarCorrente()
    }
    fun desligar(){}
}

class Computador (marca: String) : Eletronico(marca) {
    fun instalarSoftware() {}
    fun processar() {
        ativarCorrente()
    }
}

fun main() {
    var c: Computador = Computador("DELL")


    c.ligar()
    c.desligar()
    c.marca

    X()

}