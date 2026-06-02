public class App {
    public static void main(String[] args) throws Exception {
        PagamentoBoleto boleto1 = new PagamentoBoleto(500);
        PagamentoCartao cartao1 = new PagamentoCartao(1500);

        boleto1.processarPagamento();
        cartao1.processarPagamento();
    }
}
