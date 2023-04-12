class Pessoa(var anoNascimento: Int, var nome: String) {
    var documento: String = ""

    constructor()

    fun dormir() {

    }

    fun acordar() {

    }
}



fun main() {


    var pessoa: Pessoa = Pessoa(2000, "Fulano", "156641884")


    pessoa.dormir()
    pessoa.acordar()


}