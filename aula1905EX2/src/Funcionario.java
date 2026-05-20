public class Funcionario {
    String nome;
    double salario;

    public void receberAumento(double valorAdicional) {
        this.salario = this.salario + valorAdicional;
    }

    public void imprimirSalario() {
        System.out.printf("O salário do funcionario %s é de : R$ %.2f \n", this.nome, this.salario);
    }

}
