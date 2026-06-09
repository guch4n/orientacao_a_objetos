public class App {
    public static void main(String[] args) throws Exception {
        double somaNotas = 0;
        Aluno[] alunos = new Aluno[4];

        alunos[0] = new Aluno("Gustavo", 10, 8);
        alunos[1] = new Aluno("Matheus", 10, 5);
        alunos[2] = new Aluno("Bruna", 8, 7);
        alunos[3] = new Aluno("Renã", 7, 6);

        for (Aluno a : alunos) {
            somaNotas += a.getMedia();
        }

        System.out.println("A media da turma é de: " + somaNotas / alunos.length);
    }
}

