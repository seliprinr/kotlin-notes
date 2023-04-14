open class Eletronico(var marca: String) {
    private fun corrente(ativo:Boolean) {}
    fun ligar() {
        corrente(true)
    }

    open fun desligar() {
        corrente(false)
    }
}

class Computador(marca: String) : Eletronico(marca) {
    fun save() {}
    override fun desligar() {
        save()
        super.desligar()
    }

    fun save() {}
    fun save(a: Int){}
    fun save(a: Int, b: Int) {}
    fun save(a: Float) {}
    fun save(a: Double) {}
}

fun main() {
    val c: Computador = Computador("DELL")

    c.ligar()
    c.desligar()
}