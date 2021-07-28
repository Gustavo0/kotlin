package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Prateleira

fun testaUsoPrateleira(){
    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)

    val organizarPorAuthor = prateleira.organizarPorAuthor()
    val organizarPorPublicacao = prateleira.organizarPorPublicacao()

    organizarPorAuthor.imprimeComMarcadores()
    organizarPorPublicacao.imprimeComMarcadores()
}