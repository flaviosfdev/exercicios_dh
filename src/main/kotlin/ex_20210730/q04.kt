package ex_20210730

//Escrever um programa que imprima na tela os primeiros 100 númerosinteiros positivos ímpares.

fun main() {
    var impares = 1
    var contador = 1
    while (impares <= 100) {
        println("$impares - $contador")
        contador += 2
        impares++
    }
}