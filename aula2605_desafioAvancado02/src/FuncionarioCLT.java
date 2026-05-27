public class FuncionarioCLT extends Funcionario {
    
    public FuncionarioCLT(String n, double sB){
        super(n, sB);
    }

    @Override
    public double calcularSalarioLiquido(){
        return salarioBase - (salarioBase * 0.05 + salarioBase * 0.06);
    }
}
