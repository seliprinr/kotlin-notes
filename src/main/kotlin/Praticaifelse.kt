/*
1 Escreva um programa para ajudar a empresa XPTO calcular o bônus que os funcionários receberão no final
do ano. Os bônus são classificados por cargo.
a. Gerentes recebem R$ 2.000,00
b. Coordenadores recebem R$ 1.500,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00


2 Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus.
a. Gerentes com menos de 2 anos de experiência recebem R$ 2.000,00, caso contrário recebem R$ 3.000,00
b. Coordenadores com menos de 1 ano de experiência recebem R$ 1.500,00, caso contrário recebem R$ 1.800,00
c. Engenheiros de software recebem R$ 1.000,00
d. Estagiários recebem R$ 500,00


Qual o resultado das comparações abaixo?
a. (a && b && c && d)
a = false b = false c = true d = true

b. (!a && !b && (c && d))
a = false b = false c = true d = true

c. (a && ((b || c) || d))
a = false b = false c = true d = true

d. (a || ((!b && c) || !d))
a = false b = false c = true d = true

 */

fun bonus(cargo: String, experiencia: Int): Float {

    var bonus = 0f // Valor padrão
    if (cargo == "Gerente") {
        if (experiencia < 2) {
            bonus = 2000f
        } else {
            bonus = 3000f
        }
    } else if (cargo == "Coordenador") {
        if (experiencia < 1500f) {
        } else {
            bonus = 1800f
        }
        bonus = 1500f
    } else if (cargo == "Engenheiros de software") {
        bonus = 1000f
    } else if (cargo == "Estagiário") {
        bonus = 500f
    }

    return bonus
}


fun main() {
    val a = false
    val b = false
    val c = true
    val d = true

    println(a && b && c && d)
    //false

    println(!a && !b && (c && d))
    //true && true && true
    //true

    println(a && ((b || c) || !d))
    //false &&
    // false

    println(a || ((!b && c) || !d))
    //false || (true || false)
    //false || true
    //true
}