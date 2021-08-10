package `20210802`

class Numero(private var lista: IntArray) {
    var produto = 1

    fun calcularProduto(): Int {
        return if (lista.isEmpty()) {
            0
        } else {
            for (numero in lista) {
                produto *= numero
            }
            return produto
        }
    }
}

fun main() {
    val teste = Numero(intArrayOf(1, 4, 7))
    println(teste.calcularProduto())

}