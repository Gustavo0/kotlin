package br.com.alura

import br.com.alura.bytebank.modelo.Endereco
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ByteBankApplication

fun main(args: Array<String>) {
	runApplication<ByteBankApplication>(*args)
	val testeFuncao: () -> Unit
	Endereco().let {
		it
	}
	"".let(::testeRecebeString)
	1.let {
		it}
	teste (1, {})
}

fun testeRecebeString(valor: String){}

//higher order function
fun teste(teste: Int, bloco: () -> Unit) {}