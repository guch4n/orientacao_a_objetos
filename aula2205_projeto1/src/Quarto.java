public class Quarto {
    private String tipo; //Simples ou Luxo
    private Hospede hospedeAtual;
    private int numero, diasOcupados;
    private double valorDiaria;
    private boolean ocupado;

    public Quarto(int n, String t){
        this.numero = n;
        this.tipo = t;

        this.ocupado = false;
        this.diasOcupados = 0;
        this.hospedeAtual = null;
        

        if (t.equals("Simples")) {
            this.valorDiaria = 100.00;
        } else if(t.equals("Luxo")){
            this.valorDiaria = 250.00;
        } else {
            System.out.println("Opção Invalida!");
        }
    }

    public void checkIn(Hospede nH, int d){
        
        if (this.ocupado == false) {
            this.ocupado = true;
            this.hospedeAtual = nH;
            this.diasOcupados = d;
            System.out.println("Sucesso na reserva do quarto!");
        } else{
            System.out.println("Ocorreu um erro na sua reserva!");
        }
    }

    public double checkOut(){
        double calculoTotal = this.diasOcupados * this.valorDiaria;
        this.ocupado = false;
        this.diasOcupados = 0;
        this.hospedeAtual = null;

        return calculoTotal; 
    }

    public String getTipo() {
        return this.tipo;
    }

    public Hospede getHospede() {
        return this.hospedeAtual;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getDiasOcupados() {
        return this.diasOcupados;
    }

    public double getValorDiaria() {
        return this.valorDiaria;
    }

    public boolean getOcupado() {
        return this.ocupado;
    }

}
