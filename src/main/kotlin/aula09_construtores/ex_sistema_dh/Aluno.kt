package aula09_construtores.ex_sistema_dh

class Aluno(val registroAcademico: String, val nome: String, val sobrenome: String) {

    fun assistirAula() = println("$nome está assistindo aula.")

    fun fazerLicaoDeCasa() = println("$nome está fazendo a lição de casa.")

}