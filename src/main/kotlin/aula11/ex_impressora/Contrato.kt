package aula11.ex_impressora

class Contrato(override var nome: String, override var tipoDocumento: String) : IImprimivel {

    override fun imprimir(){
        println("CONTRATO -> eu sou um $nome, $tipoDocumento")
    }

}