import java.util.Scanner;

// ESTÁ COM BUG NOS QUARTOS, É PRECISO VERIFICAR O QUARTO 0 (possivel solução, quarto - 1)
// Possiveis melhorias:
// Verificar os bugs do applicativo
public class App {
    public static void main(String[] args) throws Exception {
        String nomeHospede;
        double faturamentoTotal = 0;
        int numeroQuarto = 0, quartoDesejado, opcao;
        Scanner teclado = new Scanner(System.in);
        Quarto[] quartos = new Quarto[10];

        // CRIA E NOMEIA OS QUARTOS ------------------
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                numeroQuarto = numeroQuarto + 1;
                quartos[i] = new Quarto(numeroQuarto, "Simples");
            } else {
                numeroQuarto = numeroQuarto + 1;
                quartos[i] = new Quarto(numeroQuarto, "Luxo");
            }

        }

        do {
            // Menu inicial ---------------------------------------
            System.out.println("Seja bem vindo ao menu principal do ReservaDeHoteis.com, escolha a opção desejada: ");
            System.out.println("(1) - Mostrar o mapa de quartos;");
            System.out.println("(2) - Fazer Check-in;");
            System.out.println("(3) - Fazer Check-out;");
            System.out.println("(4) - Buscar hospede;");
            System.out.println("(0) - Encerrar expediente e mostrar faturamento.");
            System.out.println(" ");
            System.out.println("Digite a opção desejada: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:
                    // MAPA DE QUARTOS -----------------------------
                    do{
                        for (Quarto i : quartos) {
                            if (i.getOcupado()) {
                            String quartoOcupado = "Ocupado";
                            System.out.println("O Quarto " + i.getTipo() + " " + i.getNumero() +
                                    " está " + quartoOcupado + " pelo Hospede: " + i.getHospede().getNome());
                            } else {
                            String quartoOcupado = "Livre";
                            System.out.println("O Quarto " + i.getTipo() + " " + i.getNumero() +
                                    " está " + quartoOcupado);
                            }
                        }
                        System.out.println("");
                    } while (opcao != 1);
                    System.out.println("");
                    teclado.nextLine();                     
                    break;

                case 2:
                    // Check-in -----------------------------------
                    System.out.println("Informe o numero do quarto que deseja fazer check-in: ");
                    quartoDesejado = teclado.nextInt() - 1;

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

                        Hospede novoHospede = new Hospede(nome, cpf, telefone);
                        quartos[quartoDesejado].checkIn(novoHospede, dias);
                        System.out.println("");
                    } else {
                        System.out.println("Quarto já ocupado, tente realizar o check in em outro quarto.\n");
                    }
                    teclado.nextLine();
                    break;
            
                case 3:
                    // Check-out ----------------------------------                    
                    double calculoTotal;
                    System.out.println("Me informe o numero do quarto que deseja fazer o checkout: ");
                    quartoDesejado = teclado.nextInt() - 1; // o correto é fazer uma função que execute isso
                    System.out.print("O preço da fatura ficou em: R$");
                    System.out.println(calculoTotal = quartos[quartoDesejado].checkOut());
                    System.out.println("");
                    faturamentoTotal = faturamentoTotal + calculoTotal;
                    teclado.nextLine();
                    break;
                
                case 4:
                    // BUSCAR HOSPEDE ------------------------------
                    System.out.println("Digite o nome do hospede que deseja verificar: ");
                    teclado.nextLine();
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
                    break;

                case 0:
                    System.out.println("O faturamento total ficou em: R$" + faturamentoTotal);

                    break;
                
                default:
                    System.out.println("Opção invalida, selecione uma das opções anteriores.\n");
                        
            }   

        } while (opcao != 0);
    }

}
