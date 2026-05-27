public class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String n, double sB) {
        this.nome = n;
        this.salarioBase = sB;
    }

    public double calcularSalarioLiquido() {
        return salarioBase;
    }

    public String getNome() {
        return this.nome;
    }
    
}
