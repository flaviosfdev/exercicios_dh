package aula14_lambda.lambdas

abstract class Aviao(var cor: String, var combustivel: String, var valor: Double) {

    open var imprimir: () -> Unit = { ->
        println(cor)
        println(combustivel)
        println(valor)
    }

    open var desconto: () -> Unit = { -> }
}

class Boeing(var modelo: String, cor: String, combustivel: String, valor: Double) :
    Aviao(cor, combustivel, valor) {

    override var imprimir: () -> Unit = {
        println(modelo)
        super.imprimir()
    }

    override var desconto: () -> Unit = { ->
        //this.valor-=100.0
        //this.valor-100.0
        //valor = valor - 100.0
        //valor-100.0
        println("Novo valor: ${valor}")
    }
}

fun main() {
    val b737 = Boeing("B737-800", "Branco", "Querosene", 2000.0)
    b737.imprimir()
    b737.desconto()
}