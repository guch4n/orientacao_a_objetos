public class App {
    public static void main(String[] args) throws Exception {
        double somaSalarios = 0;
        Funcionario[] funcionarios = new Funcionario[4];

        funcionarios[0] = new Funcionario("Marcos", 1000);
        funcionarios[1] = new FuncionarioCLT("Carlos", 1000);
        funcionarios[2] = new FuncionarioPJ("Luana", 1000);
        funcionarios[3] = new Diretor("Gustavo", 1000, 1000);

        for (Funcionario i : funcionarios) {
            System.out.println(
                    "Nome do funcionario: " + i.getNome() + ", salário liquido a receber: "
                            + i.calcularSalarioLiquido());
            somaSalarios = somaSalarios + i.calcularSalarioLiquido();
        }

        System.out.println("Custo total da folha: R$[" + somaSalarios + "]");
    }
}
