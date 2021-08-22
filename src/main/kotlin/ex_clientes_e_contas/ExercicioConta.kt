package ex_clientes_e_contas

fun main() {
    val flavio = Cliente("Flávio", "Ferreira")

    val contaFlavio = Conta("6789", 200, flavio)

    println("Informações da conta...")
    contaFlavio.contaInfo()
    println("----------------------")

    contaFlavio.depositar(100)
    println("----------------------")

    contaFlavio.sacar(350)
    println("Fim...")
}