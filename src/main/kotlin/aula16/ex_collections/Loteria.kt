package aula16.ex_collections

fun main() {

    val loteria : MutableMap<Int, String> = mutableMapOf(
        0 to "ovos",
        1 to "água",
        2 to "escopeta",
        3 to "cavalo",
        4 to "dentista",
        5 to "fogo"
    )

    fun imprimir() {
        loteria.forEach() { println("${it.key} -> ${it.value}") }
    }

    imprimir()

}