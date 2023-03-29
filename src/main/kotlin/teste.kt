import java.lang.Exception

fun main() {
    try {
        return
    } catch (e: Exception){
        println("Exception")
    } finally {
        println("Finally")
    }
}