public class Aluno {
    private String nome;
    private double prova1, prova2;

    public Aluno(String nome, double prova1, double prova2) {
        this.nome = nome;
        this.prova1 = prova1;
        this.prova2 = prova2;
    }

    public double getMedia() {
        return (prova1 + prova2) / 2;
    }

}
