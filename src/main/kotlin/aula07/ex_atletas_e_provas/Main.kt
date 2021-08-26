package aula07.ex_atletas_e_provas

fun main() {
    val flavio = Atleta("Flávio", 5, 7)
    val ferreira = Atleta("Ferreira", 4, 6)

    val corrida100mt = Prova(1, 4)
    val salto = Prova(3, 5)
    val natacao = Prova(5, 7)

    println("ATLETA: ${flavio.nome} (Nível: ${flavio.nivel} - Energia: ${flavio.energia})")
    println("Corrida 100mt (Dif.: ${corrida100mt.dificuldade} - E.N.: ${corrida100mt.energiaNecessaria}): ${corrida100mt.podeRealizar(flavio)}")
    println("Salto (Dif.: ${salto.dificuldade} - E.N.: ${salto.energiaNecessaria}): ${salto.podeRealizar(flavio)}")
    println("Natação (Dif.: ${natacao.dificuldade} - E.N.: ${natacao.energiaNecessaria}): ${natacao.podeRealizar(flavio)}")
    println("================================")
    println("ATLETA: ${ferreira.nome} (Nível: ${ferreira.nivel} - Energia: ${ferreira.energia})")
    println("Corrida 100mt (Dif.: ${corrida100mt.dificuldade} - E.N.: ${corrida100mt.energiaNecessaria}): ${corrida100mt.podeRealizar(ferreira)}")
    println("Salto (Dif.: ${salto.dificuldade} - E.N.: ${salto.energiaNecessaria}): ${salto.podeRealizar(ferreira)}")
    println("Natação (Dif.: ${natacao.dificuldade} - E.N.: ${natacao.energiaNecessaria}): ${natacao.podeRealizar(ferreira)}")


}