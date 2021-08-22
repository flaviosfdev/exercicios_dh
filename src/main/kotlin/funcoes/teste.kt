package funcoes

class Filho(var trabalha: Boolean) {
    fun ehDependente() = if (!trabalha) true else false
}

fun main() {
    //val laurinha = Filho(true)
    //println(laurinha.ehDependente())

    // função sem parâmetros
    val mensagem = { println("Estou com fome") }
    mensagem()

    // função com parâmetros
    val messagemComParametro = { texto: String, comida: String -> println("$texto $comida") }
    messagemComParametro("Estou com fome e quero comer", "pizza")

}