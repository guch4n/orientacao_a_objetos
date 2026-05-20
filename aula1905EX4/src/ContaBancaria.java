public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String t) {
        this.titular = t;
        this.saldo = 0.0;
    }

    public void depositar(double v) {
        this.saldo = this.saldo + v;
        System.out.println("Você depositou R$" + v);
    }

    public void sacar(double v) {
        if (v > this.saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            this.saldo = this.saldo - v;
            System.out.println("Saque de R$ " + v + " realizado com sucesso!");
        }
    }

    public double getSaldo() {
        System.out.println("Seu saldo é de: ");
        return this.saldo;
    }
}