package ex_20210730

fun main() {
    val num = 3
    println(ehPar(num))
}

private fun ehPar(num: Int): Boolean {
    return num % 2 == 0
}