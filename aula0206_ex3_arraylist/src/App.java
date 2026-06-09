import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        tarefas.add(new Tarefa("Limpar a casa"));
        tarefas.add(new Tarefa("Lavar a louça"));
        tarefas.add(new Tarefa("Fazer a comida"));
        tarefas.add(new Tarefa("Varrer o quintal"));

        tarefas.get(1).finalizarTarefa();

        for (Tarefa tarefa : tarefas) {
            if (!tarefa.getConcluida()) {
                System.out.println("Tarefa: " + tarefa.getDescricao() + " Pendente.");
            }
        }
    }
}
