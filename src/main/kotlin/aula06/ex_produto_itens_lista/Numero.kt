package aula06.ex_produto_itens_lista

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
