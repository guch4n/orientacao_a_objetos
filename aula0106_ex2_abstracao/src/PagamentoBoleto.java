public class PagamentoBoleto extends Pagamento{

    public PagamentoBoleto(double valor){
        super(valor);
    }

    @Override
    public void processarPagamento(){
        System.out.println("Gerando código de barras para o valor: R$ "+ this.valor);
    }
    
}
