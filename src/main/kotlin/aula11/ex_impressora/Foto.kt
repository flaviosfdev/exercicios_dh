package aula11.ex_impressora

class Foto(override var nome: String, override var tipoDocumento: String) : IImprimivel {

    override fun imprimir(){
        println("FOTO -> eu sou uma $nome, $tipoDocumento")
    }

}