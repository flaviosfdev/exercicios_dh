package ex_20210730

fun main() {
    val numA: Int = 2
    val numB: Int = 8
    val numC: Int = 4
    val numD: Int = 6

    println(analisar(numA, numB, numC, numD))

}

fun analisar( a: Int, b: Int, c: Int, d: Int ): Boolean = (a > c && a > d) || (b > c && b > d)