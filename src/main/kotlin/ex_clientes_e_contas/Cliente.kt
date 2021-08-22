package ex_clientes_e_contas

class Cliente(val nome: String, val sobrenome: String) {

    fun nomeCompleto() = "${this.nome} ${this.sobrenome}"
}