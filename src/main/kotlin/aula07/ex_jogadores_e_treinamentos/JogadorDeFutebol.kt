package aula07.ex_jogadores_e_treinamentos

class JogadorDeFutebol (
    val nome: String,
    var energia: Int = 0,
    var alegria: Int = 0,
    var gols: Int = 0,
    var experiencia: Int = 0
) {

    fun fazerGol() {
        energia -= 5
        alegria += 10
        gols ++
        println("GOOOOL do $nome")
    }

    fun correr() {
        energia -= 10
        println("Cansei (jogador: $nome)")
    }

}