package ex_interfaces

class Impressora(var listaImprimida: MutableList<IImprimivel>) {


    fun adicionaLista(imprime: IImprimivel){
        listaImprimida.add(imprime)
    }

    fun imprimirLista(){
        for(imprimivel in listaImprimida){
            imprimivel.imprimir()
        }
    }

}