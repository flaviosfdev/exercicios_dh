package funcoes.ex_lambda_valida_email

fun main() {
    val validaEmail = { email: String -> email.contains('@') }

    println("""
        === TESTE VALIDA EMAIL ===
        Teste 01 -> Argumento: teste@gmail.com | Retorno: ${validaEmail("teste@gmail.com")}
        Teste 02 -> Argumento: teste.gmail.com | Retorno: ${validaEmail("teste.gmail.com")}
    """.trimIndent()
    )
}