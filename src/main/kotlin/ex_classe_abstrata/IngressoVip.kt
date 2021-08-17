package ex_classe_abstrata

class IngressoVip(val valorAdicional: Int = 5): Ingresso() {

    override fun imprimeValor() = "R$ ${valor + valorAdicional} - Ingresso Vip"
}