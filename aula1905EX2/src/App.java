import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do 1º funcionario:");
        f1.nome = scanner.nextLine();
        System.out.println("Digite o nome do 2º funcionario:");
        f2.nome = scanner.nextLine();

        System.out.println("Digite o valor do salário do 1º funcionario:");
        f1.salario = scanner.nextDouble();
        System.out.println("Digite o valor do salário do 2º funcionario:");
        f2.salario = scanner.nextDouble();

        System.out.println("Digite o aumento que o funcionario 1º receberá:");
        f1.receberAumento(scanner.nextDouble());
        System.out.println("Digite o aumento que o funcionario 2º receberá:");
        f2.receberAumento(scanner.nextDouble());

        f1.imprimirSalario();
        f2.imprimirSalario();
        scanner.close();
    }
}
