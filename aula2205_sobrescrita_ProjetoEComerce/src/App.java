public class App {
    public static void main(String[] args) throws Exception {
        Produto produtoNormal = new Produto("Livro 1", 100);
        ProdutoFisico produtoFisico = new ProdutoFisico("Livro 2", 100);
        ProdutoDigital produtoDigital = new ProdutoDigital("Livro 3", 100);

        double valor = produtoNormal.calcularPrecoFinal();
        System.out.println("Valor normal: " + valor);
        valor = produtoFisico.calcularPrecoFinal();
        System.out.println("Valor Fisico: " + valor);
        valor = produtoDigital.calcularPrecoFinal();
        System.out.println("Valor digital: " + valor);
    }
}
