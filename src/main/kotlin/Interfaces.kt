interface Selvagem {
    fun atacar() {
        print("sdf")
    }
}

abstract class Mamifero(val nome : String) {
    fun acordar() {}
    fun dormir() {}

    abstract fun falar() {
        //logica
    }
    abstract fun comer() {}


}
class Cachorro(nome : String) : Mamifero(nome), Selvagem {
    override fun falar() {
    }
}
fun main() {

}

