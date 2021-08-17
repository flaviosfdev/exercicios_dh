package `ex-conta-santander`

class ContaCorrente(saldoCorrente: Double, clienteCorrente: Cliente, var limiteChequeEspecial: Double): Conta(saldoCorrente, clienteCorrente) {

    fun depositarCheque(cheque: Cheque) {
        fazerDeposito(cheque.valor)
    }

    override fun sacarDinheiro(quantia: Double) {
        if (quantia <= 0.0){
            println ("Operação não realizada. Motivo: valor inválido")
        }else if(quantia <= saldo){
            saldo -= quantia
            println ("Saque realizado com sucesso. Saldo Disponível: R$ $saldo")
        } else if (quantia <= saldo + limiteChequeEspecial ){
            limiteChequeEspecial -= (quantia - saldo)
            saldo = 0.0
            println ("Saque realizado com sucesso. Saldo Disponível: " +
                    "R$ $saldo Limite Disponível: R$ $limiteChequeEspecial")
        } else{
            println ("Operação não realizada. Motivo: limite insuficiente")
        }
    }
}