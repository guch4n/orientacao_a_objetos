public class Diretor extends FuncionarioCLT {
    double bonusParticipacao;

    public Diretor(String n, double vB, double bP) {
        super(n, vB);
        this.bonusParticipacao = bP;
    }

    @Override
    public double calcularSalarioLiquido() {
        return super.calcularSalarioLiquido() + this.bonusParticipacao;
    }

    
}
