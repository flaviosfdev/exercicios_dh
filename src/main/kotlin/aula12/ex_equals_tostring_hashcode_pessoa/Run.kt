package aula12.ex_equals_tostring_hashcode_pessoa

fun main() {
    val pessoa1 = Pessoa("Flávio", 123456)
    val pessoa2 = Pessoa("Eduardo", 123456)

    //equals: Resultado: false
    println(pessoa1.equals(pessoa2))
}