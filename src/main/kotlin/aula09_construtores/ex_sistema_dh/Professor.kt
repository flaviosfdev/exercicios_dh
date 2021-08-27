package aula09_construtores.ex_sistema_dh

class Professor(val nome: String, val registroDocente: String) {

    fun darAula() = println("Prof. $nome dando aula.")

    fun fazerChamada(alunos: List<Aluno>) {

        alunos.forEach { println("${it.nome} ${it.sobrenome}") }

    }

}