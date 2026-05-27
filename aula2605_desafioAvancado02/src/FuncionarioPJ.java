public class FuncionarioPJ extends Funcionario{

    public FuncionarioPJ (String n, double sB){
        super(n, sB);
    }

    @Override
    public double calcularSalarioLiquido() {
        return salarioBase + 500;
    }
    
}
