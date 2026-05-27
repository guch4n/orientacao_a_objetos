public class IngressoMeia extends Ingresso {

    public IngressoMeia(String n, double vB) {
        super(n, vB);
    }

    @Override
    public double calcularValorFinal() {
        return valorBase - (valorBase * 0.5);
    }
}
