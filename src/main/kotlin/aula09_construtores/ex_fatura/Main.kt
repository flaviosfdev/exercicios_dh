package aula09_construtores.ex_fatura

fun main() {

    val lista = DataSource.createDataSet()

    val fatura = Fatura(lista)

    println("Produto -------------- Qtd ----- Preço Unitário")
    fatura.produtos.forEach { println(
        "${it.descricao} ------ ${it.quantidadeComprada} ------ R$ ${it.precoUnitario}")
    }
    println("Total da fatura: --------------- R$ ${fatura.totalDaFatura()}")

}