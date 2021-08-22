package ex_interfaces

class Documento(override var nome: String, override var tipoDocumento: String) : IImprimivel {

    override fun imprimir(){
        println("DOCUMENTO -> eu sou um $nome, $tipoDocumento")
    }

}