public class App {
    public static void main(String[] args) throws Exception {
        Conta conta1 = new Conta("Gustavo");

        conta1.depositar(100);
        double saldoAtual = conta1.getSaldo();
        System.out.println("Saldo atual: " + saldoAtual);

        ContaPoupanca p1 = new ContaPoupanca("Gustavo");
        p1.depositar(100);
        saldoAtual = p1.getSaldo();
        System.out.println("Saldo Atual: " + saldoAtual);

        p1.renderJuros();
        saldoAtual = p1.getSaldo();
        System.out.println("Saldo Atual: " + saldoAtual);
    }
}
