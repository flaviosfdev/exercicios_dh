package aula14_lambda.ex_operacoes_matematicas

/**
 * 1 - Crie 4  funções lambdas para as operações de matemáticabásica:
 * soma,subtração, multiplicação e divisão.
 * Cada lambda receberá 2 parâmetros para realizar as operações.
 */

fun main() {

    val soma = { n1: Int, n2: Int -> n1 + n2 }
    val subtracao = { n1: Int, n2: Int -> n1 - n2 }
    val multiplicacao = { n1: Int, n2: Int -> n1 * n2 }
    val divisao = { n1: Int, n2: Int -> n1 / n2 }

    println("""
        Soma: 4 + 2 = ${soma(4, 2)}
        Subtração: 4 - 2 = ${subtracao(4, 2)}
        Multiplicação: 4 * 2 = ${multiplicacao(4, 2)}
        Divisão: 4 / 2 = ${divisao(4, 2)}
    """.trimIndent())

}