package ex_equals_tostring_hashcode_coca

data class Coca (var tamanho: Int, var preco: Double) {

    override fun equals(other: Any?) = (other is Coca && this.tamanho == other.tamanho)

    override fun toString() = "Tamanho: $tamanho | Preço: $preco"

    override fun hashCode() = tamanho
}