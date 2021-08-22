package lambdas

// kotlin.Unit : representação de nada (void do java) na linguagem kotlin

fun main() {

//    val idade = 21
//    var resultado = if (idade >= 18) {
//        println("Pode tirar CNH")
//        var retorno = "teste"
//        retorno
//    } else {
//        println("NÃO pode tirar CNH")
//    }
//
//    println(resultado)

    // print é comando de saída
    // Unit é retorno vazio (nada)
    //print("Olá mundo!")
    println(
        println(imprimir("2"))
    )
}

fun imprimir(texto: String) = texto