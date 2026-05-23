import java.util.Scanner;

// ESTÁ COM BUG NOS QUARTOS, É PRECISO VERIFICAR O QUARTO 0 (possivel solução, quarto - 1)
public class App {
    public static void main(String[] args) throws Exception {
        double faturamentoTotal;
        int numeroQuarto = 0, quartoDesejado;
        Scanner teclado = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];

        // NOMEIA OS QUARTOS E MOSTRA ------------------
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                numeroQuarto = numeroQuarto + 1;
                quartos[i] = new Quarto(numeroQuarto, "Simples");
                System.out.println(quartos[i].getNumero() + " " + quartos[i].getTipo());
            } else {
                numeroQuarto = numeroQuarto + 1;
                quartos[i] = new Quarto(numeroQuarto, "Luxo");
                System.out.println(quartos[i].getNumero() + " " + quartos[i].getTipo());
            }

        }

        // MAPA DE QUARTOS -----------------------------
        for (Quarto i : quartos) {
            if (i.getOcupado()) {
                String quartoOcupado = "Ocupado";
                System.out.println("O Quarto " + i.getNumero() +
                        " está " + quartoOcupado + "pelo Hospede: " + i.getHospede());
            } else {
                String quartoOcupado = "Livre";
                System.out.println("O Quarto " + i.getNumero() +
                        " está " + quartoOcupado);
            }

        }

        // Check-in -----------------------------------
        System.out.println("Informe o numero do quarto que deseja: ");
        quartoDesejado = teclado.nextInt();

        if (!quartos[quartoDesejado].getOcupado()) {
            teclado.nextLine();
            String nome, cpf, telefone;
            int dias;
            System.out.println("O Quarto encontra-se Livre, por favor me informe seu nome:");
            nome = teclado.nextLine();
            System.out.println("Agora seu CPF:");
            cpf = teclado.nextLine();
            System.out.println("Seu telefone:");
            telefone = teclado.nextLine();
            System.out.println("Agora me informe quantos dias de hospedagem você deseja:");
            dias = teclado.nextInt();
            teclado.nextLine();

            Hospede novoHospede = new Hospede(nome, cpf, telefone);
            quartos[quartoDesejado].checkIn(novoHospede, dias);

        }

        // Check-out ----------------------------------
        /*
         * double calculoTotal;
         * System.out.
         * println("Me informe o numero do quarto que deseja fazer o checkout: ");
         * quartoDesejado = teclado.nextInt();
         * System.out.print("O preço da fatura ficou em: R$");
         * System.out.println(calculoTotal = quartos[quartoDesejado].checkOut());
         */
        // ---------------------------------------------

        // BUSCAR HOSPEDE ------------------------------
        teclado.nextLine();
        String nomeHospede;
        System.out.println("Digite o nome do hospede que deseja verificar: ");
        nomeHospede = teclado.nextLine();

        for (Quarto i : quartos) {
            if (i.getOcupado()) {
                if (i.getHospede().getNome().equals(nomeHospede)) {
                    int numeroQuartoOcupado = i.getNumero();
                    String telefone = i.getHospede().getTelefone();
                    System.out.println("O mesmo se encontra hospedado no quarto: " + numeroQuartoOcupado
                            + ", telefone: " + telefone);
                }
            }
        }

        // --------------------------------------------
        // Falta somente criar o menu e a quebra de laço na execução
        // Verificar os bugs do applicativo

    }
}
