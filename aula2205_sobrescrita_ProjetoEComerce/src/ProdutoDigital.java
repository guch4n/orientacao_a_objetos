public class ProdutoDigital extends Produto{

    public ProdutoDigital(String n, double pB) {
        super(n, pB);
    }

    @Override
    public double calcularPrecoFinal() {
        return this.precoBase;
    }
    
}