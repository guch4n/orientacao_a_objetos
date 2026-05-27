public class ProdutoPerecivel extends ProdutoFisico {
    protected int diasParaVencer;

    public ProdutoPerecivel(String n, double pB, double pK, int dPV) {
        super(n, pB, pK);
        this.diasParaVencer = dPV;
    }

    @Override
    public double calcularPrecoFinal() {
        double desconto;
        if (this.diasParaVencer <= 3) {
            desconto = super.calcularPrecoFinal() * 0.3;
            return super.calcularPrecoFinal() - desconto;
        } else {
            return super.calcularPrecoFinal();
        }
    
    }

}
