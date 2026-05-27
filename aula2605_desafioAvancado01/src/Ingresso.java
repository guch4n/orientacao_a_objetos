public class Ingresso {
    protected String nomeEvento;
    protected double valorBase;

    public Ingresso(String n, double vB) {
        this.nomeEvento = n;
        this.valorBase = vB;
    }

    public double calcularValorFinal() {
        return this.valorBase;
    }

    public void imprimirTicket() {
        System.out.println(nomeEvento + " R$: " + calcularValorFinal());
    }
}
