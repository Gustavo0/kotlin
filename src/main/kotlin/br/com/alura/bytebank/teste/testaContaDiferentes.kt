package br.com.alura.bytebank.teste

import ContaCorrente
import ContaPoupanca
import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Endereco

fun testaContasDiferentes() {
    val cliente = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1000,
            endereco = Endereco(logradouro = "Rua 1")
    )
    val contaCorrente = ContaCorrente(
            titular = cliente,
            numero = 1000
    )

    val clienteFran = Cliente(
            nome = "Fran",
            cpf = "333.333.333-33",
            senha = 3000
    )
    val contaPoupanca = ContaPoupanca(
            titular = clienteFran,
            numero = 1001
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)

    println("saldo corrente: ${contaCorrente.saldo}")
    println("saldo poupanca: ${contaPoupanca.saldo}")

    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("saldo corrente após saque: ${contaCorrente.saldo}")
    println("saldo poupanca após saque: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca)

    println("saldo corrente após transferir para poupança: ${contaCorrente.saldo}")
    println("saldo poupanca após receber transferencia: ${contaPoupanca.saldo}")

    contaPoupanca.transfere(100.0, contaCorrente)

    println("saldo poupanca após transferir para poupança: ${contaPoupanca.saldo}")
    println("saldo corrente após receber transferencia: ${contaCorrente.saldo}")
}