public class App {
    public static void main(String[] args) throws Exception {
        Conta c1 = new Conta();

        c1.titular = "Gustavo";
        c1.depositar(100);
        c1.saldo();
        c1.sacar(150);
        c1.sacar(50);
        c1.saldo();
    }
}
