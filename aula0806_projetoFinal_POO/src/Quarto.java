public abstract class Quarto implements Financeiro {
    protected int numeroQuarto;
    protected double precoBase;
    protected boolean isOcupado;

    public Quarto(int numeroQuarto, double precoBase) {
        this.numeroQuarto = numeroQuarto;
        this.precoBase = precoBase;
        isOcupado = false;
    }

    public int getNumeroQuarto() {
        return this.numeroQuarto;
    }

    public double getPrecoBase() {
        return this.precoBase;
    }

    public boolean getIsOcupado() {
        return this.isOcupado;
    }

    public void setIsOcupado(boolean isOcupado) {
        this.isOcupado = isOcupado;
    }
}
