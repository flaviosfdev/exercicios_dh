package ex_aposentadoria

class Aposentadoria(var idade: Int, var sexo: String, var anosContribuicao: Int) {

    fun podeAposentar():Boolean {
        return if (anosContribuicao >= 30) {
            if (sexo == "feminino" && idade >= 60) {
                true
            } else sexo == "masculino" && idade >= 65
        } else false
    }
}

fun main() {
    val trabalhador01 = Aposentadoria(65, "feminino", 30)
    println(trabalhador01.podeAposentar())
}