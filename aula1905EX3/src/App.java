public class App {
    public static void main(String[] args) throws Exception {
        Carro c1 = new Carro("Gol", "Wolksvagen", 2002, "Dourado");
        Carro c2 = new Carro("Celta", "Chevrolet", 2005, "Branco");
        Carro c3 = new Carro("Palio", "Fiat", 2010, "Vermelho");

        c1.mostrar();
        c2.mostrar();
        c3.mostrar();
    }
}
