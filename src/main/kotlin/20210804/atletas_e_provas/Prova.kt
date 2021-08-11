package `20210804`.atletas_e_provas

class Prova(var dificuldade: Int, val energiaNecessaria: Int) {

    fun podeRealizar(atleta : Atleta) = (atleta.nivel >= dificuldade && atleta.energia >= energiaNecessaria)

}