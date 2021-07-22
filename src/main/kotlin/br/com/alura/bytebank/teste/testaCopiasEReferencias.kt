package br.com.alura.bytebank.teste

import ContaCorrente
import ContaPoupanca
import br.com.alura.bytebank.modelo.Cliente

fun testaCopiasEReferencias() {
    val numeroX = 10
    var numeroY = numeroX
    numeroY++

    println("numeroX $numeroX")
    println("numeroY $numeroY")

    val clienteJoao = Cliente(
            nome = "Joao",
            cpf = "222.222.222-22",
            senha = 2000
    )
    val contaJoao = ContaCorrente(clienteJoao, 1002)
    contaJoao.titular.nome = "João"

    val clienteMaria = Cliente(
            nome = "Maria",
            cpf = "444.444.444-44",
            senha = 4000
    )
    var contaMaria = ContaPoupanca(clienteMaria, 1003)
    contaMaria.titular.nome = "Maria"
    contaJoao.titular.nome = "João"

    println("titular conta joao: ${contaJoao.titular.nome}")
    println("titular conta maria: ${contaMaria.titular.nome}")

    println(contaJoao)
    println(contaMaria)
}