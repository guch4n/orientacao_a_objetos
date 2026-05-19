public class Conta {
    String titular;
    double saldo;

    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        System.out.println("Deposito no valor de (R$ " + this.saldo + ") concluído!");
    }

    public void sacar(double valor){
        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente, você só pode sacar o total de " + this.saldo);
        } else{
            this.saldo = this.saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        }
    }

    public void saldo(){
        System.out.println("O seu saldo atual é de: R$ " + this.saldo);
    }
}
