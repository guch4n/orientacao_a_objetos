public class Produto {
    protected String nome;
    protected double precoBase;

    public Produto(String n, double pB) {
        this.nome = n;
        this.precoBase = pB;
    }

    public double calcularPrecoFinal() {
        return this.precoBase = this.precoBase + (this.precoBase * 0.1);
    }
    
}