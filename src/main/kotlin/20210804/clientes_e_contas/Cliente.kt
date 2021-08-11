package `20210804`.clientes_e_contas

class Cliente(val nome: String, val sobrenome: String) {

    fun nomeCompleto() = "${this.nome} ${this.sobrenome}"
}