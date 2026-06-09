public class App {
    public static void main(String[] args) throws Exception {
        Livro[] estante = new Livro[3];

        estante[0] = new Livro("Harry Potter", "J.k. Rolling");
        estante[1] = new Livro("Senhor dos Anéis", "Tolking");
        estante[2] = new Livro("Game of Thrones", "R. R. Martins");

        for (int i = 0; i < estante.length; i++) {
            System.out.println(estante[i].getTitulo());
        }
    }
}
