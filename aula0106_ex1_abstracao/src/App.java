public class App {
    public static void main(String[] args) throws Exception {
        Vendedor vendedor1 = new Vendedor("Gustavo", 1500);
        Gerente gerente1 = new Gerente("Priscila", 5000);

        System.out.println("Salario Gustavo: " + vendedor1.calcularSalario());
        System.out.println("Salario Priscila: " + gerente1.calcularSalario());

    }
}
