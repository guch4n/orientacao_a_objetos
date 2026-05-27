public class ProdutoFisico extends Produto{

    public ProdutoFisico (String n, double pB) {
        super(n, pB);

    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase = this.precoBase + (this.precoBase * 0.1) + 50.00;
    }
    
}
