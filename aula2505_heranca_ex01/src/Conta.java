public class Conta {
    protected String titular;
    protected double saldo;

    public Conta(String t) {
        this.titular = t;
        this.saldo = 0;
    }

    public void depositar(double s) {
        this.saldo = this.saldo + s;
        System.out.println("Depósito concluído!");
    }

    public double getSaldo() {
        return this.saldo;
    }
}
