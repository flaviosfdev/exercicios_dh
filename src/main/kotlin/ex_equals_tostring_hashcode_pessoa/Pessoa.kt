package ex_equals_tostring_hashcode_pessoa

class Pessoa(var nome: String, var rg: Int) {

    override fun equals(other: Any?) = (other is Pessoa && this.rg == other.rg)

    override fun toString() = "Nome: $nome | RG: $rg"

    override fun hashCode() = rg

}