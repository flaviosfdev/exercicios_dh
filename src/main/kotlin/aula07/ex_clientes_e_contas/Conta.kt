package aula07.ex_clientes_e_contas

class Conta(val numeroConta: String, var saldo: Int, val titular: Cliente) {

    fun depositar(quantia: Int) {
        if (quantia <= 0) {
            println("Quantia inválida. Tente um valor maior que zero.")
        } else {
            println("Depositando R$ $quantia...")
            saldo += quantia
            println(novoSaldo())
        }
    }

    fun sacar(quantia: Int) {
        println("Sacando R$ $quantia...")
        if (quantia > saldo) {
            println("Saldo insuficiente. ${saldoAtual()}")
        } else {
            saldo -= quantia
            println("Transação realizada com sucesso! ${novoSaldo()}")
        }
    }

    fun contaInfo() {
        println("Cliente: ${titular.nome}")
        println("Conta: $numeroConta")
        println(saldoAtual())
    }

    private fun saldoAtual() = "Saldo atual: R$ $saldo"

    private fun novoSaldo() = "Novo saldo: R$ $saldo"
}
