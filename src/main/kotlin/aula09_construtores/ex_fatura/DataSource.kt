package aula09_construtores.ex_fatura

class DataSource {

    companion object {

        fun createDataSet(): List<Produto> {

            val notebook = Produto(34597, "Notebook Samsung", 1, 3500.00)
            val hdExterno = Produto(98523, "HDD Externo 1 TB", 1, 400.00)
            val memoria = Produto(18293, "Memória RAM 8 GB", 2, 800.00)
            val monitor = Produto(59347, "Monitor Sony 19\"", 2, 750.00)

            return listOf(notebook, hdExterno, memoria, monitor)
        }

    }

}