public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Aqui é a main.");

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente1.nome = "Gustavo";
        cliente1.idade = 23;
        cliente1.cpf = "123456789910";
        cliente1.saldoEmLoja = 100.0;

        cliente2.nome = "Priscila";
        cliente2.idade = 23;
        cliente2.cpf = "01987654321";
        cliente2.saldoEmLoja = 50.0;

        System.out.println(cliente1.nome);
        System.out.println(cliente2.nome);

    }
}
