package br.com.alura

import br.com.alura.bytebank.teste.testaComportamentosConta
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ByteBankApplication

fun main(args: Array<String>) {
	runApplication<ByteBankApplication>(*args)
	println("início main")
	testaComportamentosConta()
	println("fim main")
}