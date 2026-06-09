public class QuartoSimples extends Quarto {

    public QuartoSimples(int numeroQuarto, double precoBase) {
        super(numeroQuarto, precoBase);
    }

    @Override
    public double calcularTotal(int diarias) {
        return diarias * this.precoBase;
    }
}
