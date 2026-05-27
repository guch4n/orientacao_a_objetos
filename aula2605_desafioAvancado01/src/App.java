public class App {
    public static void main(String[] args) throws Exception {
        Ingresso[] lista = new Ingresso[5];

        lista[0] = new Ingresso("Show de Rock", 100.0);
        lista[1] = new IngressoMeia("Show de Rock", 100.0);
        lista[2] = new IngressoVIP("Show de Rock", 100.0);
        lista[3] = new Ingresso("Show de Rock", 250.0);
        lista[4] = new IngressoMeia("Show de Rock", 150.0);

        double faturamentoTotal = 0;

        for (Ingresso i : lista) {
            i.imprimirTicket();
            faturamentoTotal = faturamentoTotal + i.calcularValorFinal();
        }

        System.out.println("O faturamento total da bilheteria é de: R$" + faturamentoTotal);
    }
}
