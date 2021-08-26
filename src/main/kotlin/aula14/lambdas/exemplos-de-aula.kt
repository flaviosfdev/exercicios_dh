package aula14.lambdas

fun main() {

    // dúvida paulo victor
    val soma: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    val soma2: (Int, Int) -> Int = { a: Int, b: Int -> a + b }
    println("Soma 01")
    println(soma.toString())
    println(soma.hashCode())

    println("Soma 02")
    println(soma2.toString())
    println(soma2.hashCode())

    println("equals")
    println(soma == soma2)
}