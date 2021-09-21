package br.com.alura

import br.com.alura.bytebank.modelo.Endereco
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ByteBankApplication

fun main(args: Array<String>) {
	runApplication<ByteBankApplication>(*args)
//    val endereco = Endereco(logradouro = "rua vergueiro", numero = 3185)
//    val enderecoEmMaiusculo = "${endereco.logradouro}, ${endereco.numero}".toUpperCase()
//    println(enderecoEmMaiusculo)
	Endereco(logradouro = "rua vergueiro", numero = 3185)
		.let { endereco ->
			"${endereco.logradouro}, ${endereco.numero}".toUpperCase()
		}.let(::println)

	listOf(Endereco(complemento = "casa"),
		Endereco(),
		Endereco(complemento = "apartamento"))
		.filter { endereco -> endereco.complemento.isNotEmpty() }
		.let(::println)

}