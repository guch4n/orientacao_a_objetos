public class PagamentoCartao extends Pagamento {
    public PagamentoCartao(double valor) {
        super(valor);
    }

    public void processarPagamento() {
        System.out.println("Enviando dados para a operadora de cartão. Valor: R$ " + this.valor);
    }
}
