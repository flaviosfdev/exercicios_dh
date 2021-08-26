package aula10.ex_bilheteria

import java.util.Scanner

fun main() {

    val scan = Scanner(System.`in`)

    val ingressoPadrao = IngressoPadrao()
    val ingressoVip = IngressoVip()

    println("===== BILHETERIA =====")
    println("1 - Ingresso Padrão | 2 - Ingresso Vip")
    print("Qual ingresso desejado? ")

    val escolha = scan.nextInt()

    when (escolha) {
        1 -> println(ingressoPadrao.imprimeValor())
        2 -> println(ingressoVip.imprimeValor())
        else -> println("Opção inválida!")
    }

}