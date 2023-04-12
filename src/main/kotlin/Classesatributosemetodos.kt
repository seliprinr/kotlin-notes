class Pessoa(var anoNascimento: Int, var nome: String) {
    // comportamentos
    var olhos: String = ""

    fun dormir() {

    }

    fun acordar() {

    }
}


fun main() {
    // class -> comportamentos e atributos

    // classe (instancia) objetos
    var pessoa: Pessoa = Pessoa(2000, "Fulano")


    pessoa.dormir()
    pessoa.acordar()


}