// enum == enumerator - listar possíveis valores

enum class Prioridade (val value: Int) {
    Baixa(1) {
        override fun toString(): String {
            return "Prioridade baixa: $value"
        }
    },
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca, Tartaruga
}


fun main() {
    for(p in Prioridade.values()) {
        if(p == Prioridade.Alta)
        println(p.value)
    }
}