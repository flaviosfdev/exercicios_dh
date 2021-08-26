package aula15.ex_caixa_supermercado

class CarrinhoDeCompras {

    val listaDeProdutos = ArrayList<Produto>()

    fun adicionarProduto(produto: Produto) {
        listaDeProdutos.add(produto)
    }

}