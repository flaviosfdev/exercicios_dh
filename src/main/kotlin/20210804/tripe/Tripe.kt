package `20210804`.tripe

class Tripe(var dobrado: Boolean, val alturaMinima: Int, val alturaMaxima: Int, var alturaAtual: Int) {

    fun definirAltura(novaAltura: Int) {
        println("Altura Atual: $alturaAtual")
        if (novaAltura <= 0 || novaAltura > alturaMaxima) {
            println("Valor inválido. Atribua Nova altura entre $alturaMinima e $alturaMaxima")
        } else {
            println("Alterando altura...")
            alturaAtual = novaAltura
            println("Nova altura: $alturaAtual")
        }
    }

    fun dobrar() {
        if (dobrado) {
            println("Não foi possível dobrar o tripé, pois já está dobrado!")
        } else {
            dobrado = true
            println("O tripé foi dobrado!")
        }
    }

    fun desdobrar() {
        if (!dobrado) {
            println("Não foi possível desdobrar o tripé, pois já está desdobrado!")
        } else{
            dobrado = false
            println("O tripé foi desdobrado!")
        }
    }

    fun guardar() {
        if (prontoParaGuardar()) {
            println("Tripé guardado com sucesso!")
        } else {
            println("Não foi possível guardar o tripé!")
        }
    }

    fun prontoParaGuardar(): Boolean {
        if (alturaAtual != alturaMinima || !dobrado) {
            println("Para guardar o tripé é necessário que a altura atual seja igual a $alturaMinima e que o tripé esteja dobrado.")
            status()
            return false
        } else {
            println("O tripé está pronto para ser guardado!")
            return true
        }
    }

    fun usar() {
        if (prontoParaUsar()) {
            println("Usando o tripé...")
        } else {
            println("Não foi possível usar o tripé.")
        }

    }

    fun prontoParaUsar(): Boolean {
        if (dobrado || (alturaAtual <= (alturaMaxima / 2))) {
            println("Para usar o tripé é necessário que ele esteja desdobrado e com altura atual maior ou igual a ${(alturaMaxima / 2) + 1}.")
            return false
        } else {
            println("O tripé está pronto para ser usado!")
            return true
        }

    }

    fun status() {
        println(
            """
            === Status Tripé ===
            Altura Atual: $alturaAtual
            Altura Mínima: $alturaMinima
            Altura Máxima: $alturaMaxima
            Dobrado: $dobrado
            ===================
        """.trimIndent()
        )
    }
}