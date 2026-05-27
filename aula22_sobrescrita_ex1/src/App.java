public class App {
    public static void main(String[] args) throws Exception {
        Funcionario f1 = new Funcionario("Abner", 2000);

        double bonus = f1.calcularBonus();
        System.out.println("O bonus do funcionario é de: " + bonus);

        Gerente f2 = new Gerente("Bruno", 5000);
        bonus = f2.calcularBonus();
        System.out.println("O bonus do gerente é de: " + bonus);
    }
}
