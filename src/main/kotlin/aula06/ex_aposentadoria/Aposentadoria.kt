package aula06.ex_aposentadoria

class Aposentadoria(var idade: Int, var sexo: String, var anosContribuicao: Int) {

    fun podeAposentar():Boolean {
        return if (anosContribuicao >= 30) {
            if (sexo == "feminino" && idade >= 60) {
                true
            } else sexo == "masculino" && idade >= 65
        } else false
    }
}