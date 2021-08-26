package aula15.ex_caixa_supermercado

import java.util.ArrayList

class Caixa {

    fun fechamentoDeConta(
        cabecalhoDoComprovante: () -> Unit,
        dataDaCompra: () -> String,
        imprimeListaDeCompra: (listaDeItens: ArrayList<Produto>) -> Unit,
        adicionaRodape: () -> Unit
    ) {
        println(cabecalhoDoComprovante.invoke())
        println(dataDaCompra.invoke())
        //println(imprimeListaDeCompra()
        //println(adicionaRodape())
    }
}