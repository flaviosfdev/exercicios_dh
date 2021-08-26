package aula08.ex_conta_santander

open class Conta(var saldo: Double, val cliente: Cliente) {

    init {
        if (saldo < 0.0) {
            saldo  = 0.0
        }
    }

    open fun fazerDeposito(quantia: Double) {
        if (quantia <= 0.0) {
            exibeMensagem()
            println("Quantia inválida!")
        } else {
            saldo += quantia
            println("Depósito realizado com sucesso")
        }
    }

    open fun sacarDinheiro(quantia: Double) {
        if (quantia <= 0.0) {
            exibeMensagem()
            println("Motivo: Valor inválido.")
        } else if (quantia <= saldo) {
            saldo += quantia
            println("Saque realizado com sucesso! Saldo disponível: $saldo")
        } else {
            exibeMensagem()
            println("Motivo: Saldo insuficiente!")
        }
    }

    open fun consultarSaldo() {
        println("Saldo atual: $saldo")
    }

    private fun exibeMensagem() {
        println("Operação não executada!")
    }
}