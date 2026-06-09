import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> produtos = new ArrayList<>();

        produtos.add("Notebook"); // 0
        produtos.add("Televisão"); // 1
        produtos.add("Controle remoto"); // 2

        produtos.remove(1);

        for (String item : produtos) {
            System.out.println(item);
        }
    }
}
