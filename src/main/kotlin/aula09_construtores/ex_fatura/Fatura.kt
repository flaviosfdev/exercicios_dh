package aula09_construtores.ex_fatura

class Fatura(val produtos: List<Produto>) {


    fun totalDaFatura(): Double {
        var total = 0.0
        produtos.forEach { total += (it.precoUnitario * it.quantidadeComprada) }
        return total
    }

}