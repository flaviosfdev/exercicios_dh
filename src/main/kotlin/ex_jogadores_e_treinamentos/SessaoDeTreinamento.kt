package ex_jogadores_e_treinamentos

class SessaoDeTreinamento (var experiencia : Int = 0) {

    fun treinarA(jogador : JogadorDeFutebol) {
        experiencia = jogador.experiencia
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()
        jogador.experiencia += 1
        println("""
            Experiência Anterior: $experiencia
            Experiência Atual: ${jogador.experiencia}
        """.trimIndent())
        status(jogador)
    }

    private fun status(jogador: JogadorDeFutebol) {
        println("""
            Jogador: ${jogador.nome}
            Energia: ${jogador.energia}
            Alegria: ${jogador.alegria}
            Gols: ${jogador.gols}
            Experiencia: ${jogador.experiencia}
        """.trimIndent())
    }

}