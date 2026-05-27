public class IngressoVIP extends Ingresso {

    public IngressoVIP(String n, double vB) {
        super(n, vB);
    }

    @Override
    public double calcularValorFinal() {
        return valorBase + 120;
    }

    @Override
    public void imprimirTicket() {
        System.out.println(nomeEvento + " R$: " + calcularValorFinal() + " -- ACESSO VIP LIBERADO --");

    }
}
