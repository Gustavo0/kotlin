package br.com.alura.bytebank.teste

import ContaCorrente
import ContaPoupanca
import br.com.alura.bytebank.modelo.Cliente

fun testaComportamentosConta() {
    val cliente = Cliente(
            nome = "Alex",
            cpf = "111.111.111-11",
            senha = 1000
    )
    val contaAlex = ContaCorrente(titular = cliente, numero = 1000)
    contaAlex.deposita(200.0)

    val clienteFran = Cliente(
            nome = "Fran",
            cpf = "333.333.333-33",
            senha = 3000
    )
    val contaFran = ContaPoupanca(numero = 1001, titular = clienteFran)
    contaFran.deposita(300.0)

    println(contaFran.titular)
    println(contaFran.numero)
    println(contaFran.saldo)

    println(contaAlex.titular)
    println(contaAlex.numero)
    println(contaAlex.saldo)

    println("depositando na conta do Alex")
    contaAlex.deposita(50.0)
    println(contaAlex.saldo)

    println("depositando na conta da Fran")
    contaFran.deposita(70.0)
    println(contaFran.saldo)

    println("sacando na conta do Alex")
    contaAlex.saca(250.0)
    println(contaAlex.saldo)

    println("sacando na conta da Fran")
    contaFran.saca(100.0)
    println(contaFran.saldo)

    println("saque em excesso na conta do Alex")
    contaAlex.saca(100.0)
    println(contaAlex.saldo)

    println("saque em excesso na conta da Fran")
    contaFran.saca(500.0)
    println(contaFran.saldo)

    println("Transferência da conta da Fran para o Alex")

    if (contaFran.transfere(destino = contaAlex, valor = 300.0)) {
        println("Transferência sucedida")
    } else {
        println("Falha na transferência")
    }

    println(contaAlex.saldo)
    println(contaFran.saldo)
}