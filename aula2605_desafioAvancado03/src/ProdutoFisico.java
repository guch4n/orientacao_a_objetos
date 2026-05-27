public class ProdutoFisico extends Produto{
    protected double pesoKg;
    
    public ProdutoFisico(String n, double pB, double pK) {
        super(n, pB);
        this.pesoKg = pK;
    }

    @Override
    public double calcularPrecoFinal() {
        double frete = 5.00;
        return precoBase + frete * this.pesoKg;
    }
}
