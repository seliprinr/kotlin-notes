class Animal(var especie: String) {
    var fala: String = ""
    init {
        fala = if (especie == "cachorro") {
            "au"
        } else if (especie == "gato") {
            "miau"
        } else {
            ""
        }
    }
    fun falar() {
        println(fala)
    }
}

fun main() {
    Animal("cachorro").falar()

}