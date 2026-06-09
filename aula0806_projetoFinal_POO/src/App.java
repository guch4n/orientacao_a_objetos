import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int menu;
        Scanner scanner = new Scanner(System.in);
        Quarto[] quartos = new Quarto[5];
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Hospedagem> hospedagens = new ArrayList<>();

        quartos[0] = new QuartoSimples(100, 100);
        quartos[1] = new QuartoLuxo(200, 200);
        quartos[2] = new QuartoSimples(101, 100);
        quartos[3] = new QuartoLuxo(201, 200);
        quartos[4] = new QuartoSimples(102, 100);

        do {
            System.out.println("=======m MAPA DE QUARTOS m=======");
            for (Quarto quarto : quartos) {
                if (quarto.getIsOcupado()) {
                    System.out.println("Quarto " + quarto.getNumeroQuarto() + " está ocupado.");
                } else {
                    System.out.println("O quarto " + quarto.getNumeroQuarto() + " está livre.");
                }
            }
            System.out.println("=================================");

            System.out.println("Seja bem vindo ao HospedAki.com");
            System.out.println("Selecione a opção que deseja");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Check-in");
            System.out.println("3 - Check-out (Inativar)");
            System.out.println("4 - Balanço de Caixa");
            System.out.println("0 - Sair");
            menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Digite o nome do cliente: ");
                    String nome = scanner.nextLine();
                    System.out.println("Digite o CPF do cliente: ");
                    String CPF = scanner.nextLine();

                    clientes.add(new Cliente(nome, CPF));
                    break;

                case 2:
                    for (int i = 0; i < clientes.size(); i++) {
                        System.out.println(i + " - " + clientes.get(i).getNome());
                    }

                    System.out.println("Digite o indice do cliente:");
                    int cId = scanner.nextInt();

                    System.out.println("Digite o numero do quarto:");
                    int nQuarto = scanner.nextInt();

                    System.out.println("Digite o numero de diárias:");
                    int nDiarais = scanner.nextInt();

                    for (Quarto q : quartos) {
                        if (!q.getIsOcupado() && q.getNumeroQuarto() == nQuarto)
                            ;
                        q.setIsOcupado(true);
                        hospedagens.add(new Hospedagem(q, clientes.get(cId), nDiarais));
                        System.out.println("Hospedagem criada com sucesso!");
                        break;
                    }
                    break;

                case 3:
                    System.out.println("Digite o numero do quarto que deseja fazer Check-out: ");
                    int nOut = scanner.nextInt();

                    for (Hospedagem hospedagem : hospedagens) {
                        if (hospedagem.getQuarto().getNumeroQuarto() == nOut && hospedagem.getIsAtiva()) {
                            double total = hospedagem.getQuarto().calcularTotal(hospedagem.getDiarias());
                            System.out.println("Total a pagar: R$ " + total);
                            hospedagem.getQuarto().setIsOcupado(false);
                            hospedagem.setIsAtiva(false);
                            hospedagem.setValorTotal(total);
                            System.out.println("Check-out realizado!");
                            break;
                        }
                    }

                    break;

                case 4:
                    double totalCaixa = 0;
                    ;
                    for (Hospedagem hospedagem : hospedagens) {
                        if (!hospedagem.getIsAtiva()) {
                            totalCaixa += hospedagem.getValorTotal();
                        }
                    }

                    System.out.println("Balanço total: R$ " + totalCaixa);
                    break;

                case 0:
                    System.out.println("Até mais!");
                    break;

                default:
                    System.out.println("Opção invalida");
                    break;
            }
        } while (menu != 0);

    }
}
