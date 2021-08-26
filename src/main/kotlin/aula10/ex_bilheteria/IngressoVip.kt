package aula10.ex_bilheteria

class IngressoVip(val valorAdicional: Int = 5): Ingresso() {

    override fun imprimeValor() = "R$ ${valor + valorAdicional} - Ingresso Vip"
}