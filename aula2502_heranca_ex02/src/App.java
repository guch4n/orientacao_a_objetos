public class App {
    public static void main(String[] args) throws Exception {

        Cachorro doguinho = new Cachorro("Osvaldo", 5);
        Gato bichano = new Gato("Jucileide", 2);
        Animal humano = new Animal("Mafagafo", 19);

        bichano.miar();
        bichano.dormir();
        doguinho.latir();
        doguinho.dormir();
        humano.dormir();

    }
}
