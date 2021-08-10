package `20210730`

fun main() {
    val n1: Int = 5
    val n2: Int = 4
    val n3: Int = 3

    if (n1 >= n2 && n1 >= n3) {
        println("Maior: $n1")
    } else {
        if (n2 >= n3) {
            println("Maior: $n2")
        } else {
            println("Maior: $n3")
        }
    }
}