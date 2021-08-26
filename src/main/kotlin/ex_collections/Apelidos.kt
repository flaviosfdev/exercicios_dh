package ex_collections

fun main() {

    val apelidos = mutableMapOf(
        "joão" to listOf("Juan", "El Divo", "Maromba", "Zé Bonitinho"),
        "Miguel" to listOf("Dark Knight", "Bruce Wayne", "Batfleck", "Gengiva"),
        "Maria" to listOf("Ju", "Mary", "Marilene", "Ventania"),
        "Lucas" to listOf("Lukinha", "Jorge", "George", "Kevin Flynn")
    )

    fun imprimir() {
        apelidos.forEach { println("${it.key} -> ${it.value}}") }
    }

    imprimir()

}