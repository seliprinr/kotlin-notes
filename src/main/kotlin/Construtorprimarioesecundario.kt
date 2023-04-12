class Pessoa(var anoNascimento: Int, var nome: String) {
    var documento: String = ""

    var doc: String? = null
    constructor(anoNascimento: Int, nome: String, doc: String) : this(anoNascimento, nome) {
        this.doc = doc
    }

    fun dormir() {

    }

    fun acordar() {

    }
}



fun main() {


    var pessoa: Pessoa = Pessoa(2000, "Fulano", "156641884")

    // this - se refere ao objeto


    pessoa.dormir()
    pessoa.acordar()
    pessoa.doc


}