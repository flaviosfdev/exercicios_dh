package aula11.ex_impressora

class Documento(override var nome: String, override var tipoDocumento: String) : IImprimivel {

    override fun imprimir(){
        println("DOCUMENTO -> eu sou um $nome, $tipoDocumento")
    }

}