package `20210804`.clientes_e_contas

class Conta(val numeroConta: String, var saldo: Int, val titular: Cliente) {

    fun depositar(quantia: Int) {
        println("Depositando R$ $quantia...")
        this.saldo += quantia
        println(this.consultarSaldo())
    }

    fun sacar(quantia: Int) {
        println("Sacando R$ $quantia...")
        if (quantia > this.saldo) {
            println("Saldo insuficiente")
            println(this.consultarSaldo())
        } else {
            this.saldo -= quantia
            println("Transação realizada!")
            println(this.consultarSaldo())
        }
    }

    fun consultarSaldo() = "Saldo Atual: R$ ${this.saldo}"

    fun contaInfo() {
        println("Cliente: ${this.titular.nomeCompleto()}")
        println("Conta: ${this.numeroConta}")
        println(this.consultarSaldo())
    }
}
