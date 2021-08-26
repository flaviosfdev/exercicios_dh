package aula15.ex_caixa_supermercado

fun main() {

    val carrinho = CarrinhoDeCompras()
    val papinha = Produto("Papinha", 4.50)
    carrinho.adicionarProduto(papinha)

    val frauda = Produto("Frauda Descartável", 34.90)
    carrinho.adicionarProduto(frauda)

    val leite = Produto("Leite", 39.90)
    carrinho.adicionarProduto(leite)

    val mamadeira = Produto("Mamadeira", 17.90)
    carrinho.adicionarProduto(mamadeira)

    carrinho.toString()

    val caixa = Caixa()
//    caixa.fechamentoDeConta(
//        { cabecalhoDoComprovante() },
//        dataDaCompra = { dataDaCompra() },
//        imprimeListaDeCompra(carrinho.listaDeProdutos),
//        )
//

    val mapa : MutableMap<String, Int> = mutableMapOf("nome" to 2)
}