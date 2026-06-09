public class Tarefa {
    private String descricao;
    private boolean concluida;

    public Tarefa(String descricao){
        this.descricao = descricao;
        concluida = false;
    }

    public void finalizarTarefa() {
        concluida = true;
    }

    public String getDescricao () {
        return this.descricao;
    }

    public boolean getConcluida () {
        return this.concluida;
    }
}
