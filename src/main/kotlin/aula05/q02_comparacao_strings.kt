package aula05

fun main() {
    val texto01 = "texto"
    val texto02 = "textO"
    println(comparar(texto01, texto02))
}

private fun comparar(t01: String, t02: String) : Boolean {
    return t01 == t02
}