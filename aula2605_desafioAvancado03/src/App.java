public class App {
    public static void main(String[] args) throws Exception {
        double totalAPagar = 0;
        Produto[] produtos = new Produto[4];

        produtos[0] = new ProdutoPerecivel("Presunto", 30, 5, 5);
        produtos[1] = new ProdutoDigital("Celular", 2500);
        produtos[2] = new ProdutoFisico("Fogão", 700, 30);
        produtos[3] = new ProdutoPerecivel("Queijo", 30, 5, 1);

        for (Produto i : produtos) {
            System.out.println("Preço: " + i.calcularPrecoFinal());
            totalAPagar = totalAPagar + i.calcularPrecoFinal();
        }

        System.out.println("Total a pagar: " + totalAPagar);
    }
}
