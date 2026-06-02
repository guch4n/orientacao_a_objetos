public class App {
    public static void main(String[] args) throws Exception {
        LampadaRGB lampada = new LampadaRGB();
        Televisao televisao = new Televisao();

        lampada.ligar();
        lampada.desligar();
        televisao.ligar();
        televisao.desligar();
    }
}
