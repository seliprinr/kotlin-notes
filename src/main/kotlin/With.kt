fun main() {


    val pessoaCriadaParaExecucaoDeTestes = Pessoa (1985, "Frank")
    pessoaCriadaParaExecucaoDeTestes.acordar()
    pessoaCriadaParaExecucaoDeTestes.dormir()

    with(pessoaCriadaParaExecucaoDeTestes) {
        this.acordar()
        this.dormir()
    }

}