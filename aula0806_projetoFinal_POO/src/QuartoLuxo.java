public class QuartoLuxo extends Quarto {
    public QuartoLuxo(int numeroQuarto, double precoBase) {
        super(numeroQuarto, precoBase);
    }

    @Override
    public double calcularTotal(int diarias) {
        return diarias * this.precoBase * 1.20;
    }
}
