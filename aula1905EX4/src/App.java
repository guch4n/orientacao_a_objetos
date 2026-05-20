public class App {
    public static void main(String[] args) throws Exception {
        ContaBancaria c1 = new ContaBancaria("Gustavo");

        c1.getSaldo();
        c1.depositar(1000);
        c1.sacar(5000);
        c1.sacar(999);
        c1.getSaldo();
    }
}
