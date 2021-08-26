package aula11.ex_impressora

fun main(){
    val documento = Documento("Cadastro de Pessoas Físicas", "CPF")
    val foto = Foto("Foto Digital", "PNG")
    val contrato = Contrato("Contrato de Trabalho", "CLT")

    val impressora = Impressora(mutableListOf(documento, foto, contrato))

    impressora.imprimirLista()
}