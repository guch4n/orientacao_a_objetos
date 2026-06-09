import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Musica> musicas = new ArrayList<>();

        musicas.add(new Musica("Numb", "Linkin Park"));
        musicas.add(new Musica("In the End", "Linkin Park"));
        musicas.add(new Musica("Chop Suey", "System of a down"));

        for (Musica musica : musicas) {
            System.out.println("Tocando: " + musica.getTitulo() + " - " + musica.getArtista());
        }
    }
}
