package lambdas

fun main() {

    val texto: (Any) -> Boolean = {
        it.toString().length >= 7
    }

    val nome = "12345£".trim()

    println(texto(nome))

}