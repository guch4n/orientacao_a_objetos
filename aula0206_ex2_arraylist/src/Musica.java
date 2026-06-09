public class Musica {
    private String titulo, artista;

    public Musica(String titulo, String artista) {
        this.titulo = titulo;
        this.artista = artista;
    }

    public String getTitulo () {
        return this.titulo;
    }

    public String getArtista () {
        return this.artista;
    }
}
