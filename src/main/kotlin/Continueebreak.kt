fun main() {

    val str = "LoremipsumLoremipsum Loremipsum"
    var i = 0
    while (i < 80) {

        if (i < 50) {
            i++
            continue
        }

        print("$i ")
        i++
    }
}