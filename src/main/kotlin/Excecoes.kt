fun main() {


    try {

        val s: String? = null
        println(s!!.length)

        val a = 10/0
    } catch (e: NullPointerException) {
        println("Variável null")
    } catch (e: ArithmeticException) {
        println("Impossível dividir por zero!")
    } catch (e: Exception) {
        println("Generica")
    }

    println("Fim.")
}