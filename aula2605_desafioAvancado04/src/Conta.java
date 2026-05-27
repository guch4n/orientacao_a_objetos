public class Conta {
    protected String titular;
    protected double saldo = 0;

    public Conta(String titular) {
        this.titular = titular;
    }

    public void Depositar(double valor) {
        this.saldo = this.saldo + valor;
    }

    public boolean Sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean Transferir(Conta destino, double valor) {

        if(Sacar(valor)) {
            System.out.println("Transferencia realizada com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            return false;
        }
    }
}
