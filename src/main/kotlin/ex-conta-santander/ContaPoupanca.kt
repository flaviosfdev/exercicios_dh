package `ex-conta-santander`

class ContaPoupanca(saldoPoupanca: Double, clientePoupanca: Cliente, var txJuros: Double = 0.025) :
    Conta(saldoPoupanca, clientePoupanca) {

        fun recolherJuros() {
            saldo += (saldo * txJuros)
        }

}