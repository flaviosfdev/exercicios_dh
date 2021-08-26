package aula15.ex_caixa_supermercado

import java.text.DecimalFormat
import java.util.*

/*
* Funções de utilidades genéricas
* */

val cabecalhoDoComprovante : () -> Unit  = { println("########## DH SuperMarket ##########") }

val dataDaCompra : () -> String = {
    val data = Calendar.getInstance()
    "Data: ${data.get(Calendar.DATE)}/${data.get(Calendar.MONTH)}/${data.get(Calendar.YEAR)}"
}

val imprimeListaDeCompra : (listaDeItens: ArrayList<Produto>) -> Unit = { listaDeItens ->
    for (item in listaDeItens) println("${item.nome} R$ ${numeroDecimal(item.preco)}")
}

val adicionaRodape : (listaDeProdutos : ArrayList<Produto>) -> Unit = { listaDeProdutos ->
    var somaTotal = 0.0
    for (item in listaDeProdutos) somaTotal += item.preco
    "Total: R$ ${numeroDecimal(somaTotal)}"
}

val numeroDecimal = {number: Double ->
    val dec = DecimalFormat("#,###.00") //2 casas decimais no final separado milhar "." e decimais ","
    dec.format(number)
}

fun main() {
    cabecalhoDoComprovante()
    println(dataDaCompra())
    val arroz = Produto("Arroz", 3.50)
    val feijao = Produto("Feijão", 5.50)
    imprimeListaDeCompra(arrayListOf(arroz, feijao))
    adicionaRodape(arrayListOf(arroz, feijao))
}