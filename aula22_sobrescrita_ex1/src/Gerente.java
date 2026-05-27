public class Gerente extends Funcionario{
    
    public Gerente(String n, double s) {
        super(n, s);
    }

    @Override //Anotação que sinaliza uma sobrescrita com as novas funções da classe mãe
    public double calcularBonus() {
        return this.salario * 0.2;
    }
}
