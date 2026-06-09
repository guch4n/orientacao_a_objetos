public class Hospedagem {
    protected Quarto quarto;
    protected Cliente hospede;
    protected int diarias;
    protected boolean isAtiva; //Sempre começa como true
    protected double valorTotal; //Sempre começa como 0

    public Hospedagem(Quarto quarto, Cliente hospede, int diarias) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.diarias = diarias;
        isAtiva = true;
        valorTotal = 0;
    }

    public Quarto getQuarto() {
        return this.quarto;
    }

    public Cliente getHospede() {
        return this.hospede;
    }

    public int getDiarias() {
        return this.diarias;
    }

    public double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public boolean getIsAtiva() {
        return this.isAtiva;
    }

    public void setIsAtiva(boolean isAtiva) {
        this.isAtiva = isAtiva;
    }
}
