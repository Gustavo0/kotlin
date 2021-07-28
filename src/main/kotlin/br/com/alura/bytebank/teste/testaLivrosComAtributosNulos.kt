package br.com.alura.bytebank.teste

fun testaLivrosComAtributosNulos(){
    listaDeLivros
        .groupBy { it.editora ?: "Editora desconhecida"}
        .forEach { (editora, livros) ->
            println("$editora: ${livros.joinToString { it.titulo }}")
        }
}