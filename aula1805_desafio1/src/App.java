public class App {
    public static void main(String[] args) throws Exception {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 2300.0;
        produto1.quantidadeEstoque = 25;

        produto2.nome = "mouse";
        produto2.preco = 50.99;
        produto2.quantidadeEstoque = 300;

        System.out.println("O valor total do estoque do produto (" + produto1.nome + ") é de: "
                + produto1.preco * produto1.quantidadeEstoque);
        System.out.println("O valor total do estoque do produto (" + produto2.nome + ") é de: "
                + produto2.preco * produto2.quantidadeEstoque);

        produto1.adicionarEstoque(15);

        System.out.println("Qtd estoque " + produto1.nome + ": " + produto1.quantidadeEstoque);

    }
}
