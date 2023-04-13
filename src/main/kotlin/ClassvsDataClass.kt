fun main() {

    // objeto(f1) -> endereço de memória1
    // objeto(f2) -> endereço de memória2

    val f1: FormaData = FormaData(10, 8)
    var f2: FormaData
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("-------------")
    println(f2.toString())
    println(f2.hashCode())
    f2 = f1.copy(50)

}


class Forma(val a: Int, val b: Int) {
    override fun equals(other: Any?): Boolean {
       return if (other is Forma) {
            (other.a == this.a && other.b == this.b)
        } else {
            false
        }
    }
}

data class FormaData(val a: Int, val b: Int)