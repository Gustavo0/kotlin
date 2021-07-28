package br.com.alura.bytebank.modelo

data class Prateleira(
    val genero: String,
    val livros: List<Livro>
){
    fun organizarPorAuthor(): List<Livro>{
        return livros.sortedBy { it.autor }
    }

    fun organizarPorPublicacao(): List<Livro>{
        return livros.sortedBy { it.anoPublicacao }
    }
}