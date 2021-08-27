package aula09_construtores.ex_fatura

class Produto(
    val numero: Int,
    val descricao: String,
    var quantidadeComprada: Int,
    var precoUnitario: Double
) {

    init {
        if (quantidadeComprada < 0) quantidadeComprada = 0
        if (precoUnitario < 0) precoUnitario = 0.0
    }

}