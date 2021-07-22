import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.ContaTransferivel

class ContaPoupanca(
    titular: Cliente,
    numero: Int
) : ContaTransferivel(
    titular = titular,
    numero = numero
) {
    override fun saca(valor: Double) {
        if(this.saldo >= valor){
            this.saldo -= valor
        }
    }
}