package aula07.ex_jogadores_e_treinamentos

fun main() {

    val jogador1 = JogadorDeFutebol("Flávio")
    val jogador2 = JogadorDeFutebol("Margarete")

    val treino = SessaoDeTreinamento()
    treino.treinarA(jogador1)

}