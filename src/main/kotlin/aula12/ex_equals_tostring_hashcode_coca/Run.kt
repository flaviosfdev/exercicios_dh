package aula12.ex_equals_tostring_hashcode_coca

fun main() {
    val coca1 = Coca(200, 4.75)
    val coca2 = Coca(200, 4.75)

    println(coca1.hashCode())
    println(coca2.hashCode())

}