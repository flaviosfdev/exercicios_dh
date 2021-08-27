package aula12_equals_hashcode_tostring.ex_data_class_pessoa

fun main() {
    val pessoa1 = Pessoa("Flávio", 123)
    val pessoa2 = Pessoa("Flávio", 123)

    println("=== Pessoa 01 ===")
    println("$pessoa1 + ${pessoa1.hashCode()}")
    println("=== Pessoa 02 ===")
    println("$pessoa2 + ${pessoa2.hashCode()}")
    println("=== Equals ===")
    println(pessoa1 == pessoa2)
}